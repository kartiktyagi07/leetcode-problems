class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            if(map.isEmpty()){
                map.put(x,1);
            }else{
                map.put(x,map.getOrDefault(x,0)+1);
            }
        }
        for(Integer value:map.values()){
            if(value%2!=0){
                return false;
            }
        }
        return true;
    }
}