class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int oddMax=Integer.MIN_VALUE;
        int evenMin=Integer.MAX_VALUE;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            int val=entry.getValue();
            if(val%2==0){
                if(val<evenMin){
                    evenMin=val;
                }
            }else{
                if(val>oddMax){
                    oddMax=val;
                }
            }
        }
        return oddMax-evenMin;
    }
}