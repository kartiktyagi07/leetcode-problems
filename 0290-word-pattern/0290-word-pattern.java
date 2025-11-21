class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> mapCS = new HashMap<>();
        HashMap<String, Character> mapSC = new HashMap<>();
        String[] arr = s.split(" ");
        if(arr.length != pattern.length()) return false;
        for (int i = 0; i < arr.length; i++) {
            char ch = pattern.charAt(i);
            String word = arr[i];
            if(mapCS.containsKey(ch)){
                if(!mapCS.get(ch).equals(word)) return false;
            }else{
                mapCS.put(ch,word);
            }
            if(mapSC.containsKey(word)){
                if(mapSC.get(word) != ch) return false;
            }else{
                mapSC.put(word,ch);
            }
        }
        return true;
    }
}