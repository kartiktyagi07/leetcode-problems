class Solution {
    public final HashMap<Character,String> map=new HashMap<>();
    public Solution() {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }
    public List<String> letterCombinations(String digits) {
        if(digits==null || digits.isEmpty()){
            return new ArrayList<>();
        }
        List<String> ans=new ArrayList<>();
        helper(digits,ans,0,new StringBuilder());
        return ans;
    }
    public void helper(String digits,List<String> ans,int idx,StringBuilder sb){
        if(idx==digits.length()){
            ans.add(sb.toString());
            return;
        }
        String letter=map.get(digits.charAt(idx));
        for(char ch:letter.toCharArray()){
            sb.append(ch);
            helper(digits,ans,idx+1,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}