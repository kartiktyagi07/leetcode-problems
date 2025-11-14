class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int prefixSum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            prefixSum += nums[i];
            int rem = prefixSum % k;
            if(rem < 0){
                rem += k;
            } 
            if(map.containsKey(rem)){
                int lastIndex = map.get(rem);
                if(i - lastIndex >= 2){
                    return true;
                } 
            }else{
                map.put(rem,i);
            }
        }
        return false;
    }
}