class Solution {
    public int maximumLength(String s) {
        // to store all the substrings in a lsit
        ArrayList<String> list=new ArrayList<>();
        // generating all substrings
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                list.add(s.substring(i,j));
            }
        }
        // creates a map to store the frequency of substrings where key is substring
        // and no. of times of occurence is value
        Map<String,Integer> cntmap=new HashMap<>();
        for(String strx:list){
            if(special(strx)){
                cntmap.put(strx,cntmap.getOrDefault(strx,0)+1);
            }
        }
        // to fing the maximum length substring
        int max=-1;
        for(Map.Entry<String,Integer> entry : cntmap.entrySet()){
            String str=entry.getKey();
            int val=entry.getValue();
            if(val>=3){
                max=Math.max(max,str.length());
            }
        }
        return max;

        
    }
    // it is the method to check if a substring is special
    public static boolean special(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != str.charAt(0)){
                return false;
            }
        }
        return true;
    }
}