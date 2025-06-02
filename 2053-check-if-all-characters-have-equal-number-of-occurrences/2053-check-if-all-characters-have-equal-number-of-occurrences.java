class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int val=map.values().iterator().next();;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()!=val) return false;
        }
        return true;
    }
}