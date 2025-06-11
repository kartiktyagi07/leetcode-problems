class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        Set<Character> set=new HashSet<>();
        for(char ch:s.toCharArray()){
            set.add(ch);
        }
        if(s.equals(goal) && set.size()<s.length()){
            return true;
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=goal.charAt(i)){
                list.add(i);
                if(list.size()>2){
                    return false;
                }
            }
        }
        if(list.size()!=2){
            return false;
        }
        int i = list.get(0), j = list.get(1);
        return s.charAt(i) == goal.charAt(j) && s.charAt(j) == goal.charAt(i);
    }
}