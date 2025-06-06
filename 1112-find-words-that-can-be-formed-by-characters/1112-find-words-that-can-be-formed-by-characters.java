class Solution {
    public int countCharacters(String[] words, String chars) {
        int ans=0;
        HashMap<Character,Integer> charMap=new HashMap<>();
        for(char ch:chars.toCharArray()){
            charMap.put(ch,charMap.getOrDefault(ch,0)+1);
        }
        for(String x:words){
            HashMap<Character,Integer> tempMap=new HashMap<>(charMap);
            boolean flag=true;
            for(char ch:x.toCharArray()){
                if(tempMap.getOrDefault(ch,0)>0){
                    tempMap.put(ch, tempMap.get(ch) - 1);
                }else{
                    flag=false;
                    break;
                }
            }
            if(flag) ans+=x.length();
        }
        return ans;
    }
}