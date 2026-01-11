class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int sum = 0;
        int cnt = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i:nums){
            sum += i;
            if(map.containsKey(sum - goal)){
                cnt += map.get(sum - goal);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}