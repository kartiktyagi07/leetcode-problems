class Solution {
    static String[] words={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public ArrayList<String> letterCombinations(String str) {
         if(str.length()==0){
            ArrayList<String> bref=new ArrayList<>();
            // bref.add("");
            return bref;
        }
        char ch=str.charAt(0);
        String rstr=str.substring(1);
        ArrayList<String> rres=letterCombinations(rstr);
        ArrayList<String> ans=new ArrayList<>();
        String newstr=words[ch-'0'];
        for(int i=0;i<newstr.length();i++){
            char newch=newstr.charAt(i);
            for(String resstr:rres){
                ans.add(newch+resstr);
            }
        }
        if (rres.isEmpty()) {
            for (char newch : newstr.toCharArray()) {
                ans.add(String.valueOf(newch));
            }
        }
        return ans;
    }
}