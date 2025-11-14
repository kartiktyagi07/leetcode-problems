class Solution {
    public int subarraySum(int[] nums, int k) {
        // Brute Force: Got Accepted
        // int cnt = 0;
        // int n = nums.length;
        // for(int i=0;i<n;i++){
        //     int sum = 0;
        //     for(int j=i;j<n;j++){
        //         sum += nums[j];
        //         if(sum==k){
        //             cnt++;
        //         }
        //     }
        // }
        // return cnt;

        // Optimized Solution: HashMap amd prefixSum
        int prefixSum = 0;
        int cnt = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int num : nums){
            prefixSum += num;
            if(map.containsKey(prefixSum-k)){
                cnt+=map.get(prefixSum-k);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return cnt;
    }
}