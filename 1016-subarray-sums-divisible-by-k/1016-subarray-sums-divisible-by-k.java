class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        // Brute Force: calculate all subarray's sum and check the condition, 38/76
        // It will give TLE cause TC:O(N^3)

        // int n = nums.length;
        // int cnt = 0;
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         int sum = 0;
        //         for(int z=i;z<=j;z++){
        //             sum += nums[z];
        //         }
        //         if(sum%k==0) cnt++;
        //     }
        // }
        // return cnt;

        // TC:O(N^2) Maintain a running sum, 71/76 still TLE

        // int cnt = 0;
        // int n = nums.length;
        // for(int i=0;i<n;i++){
        //     int sum = 0;
        //     for(int j=i;j<n;j++){
        //         sum+=nums[j];
        //         if(sum%k==0){
        //             cnt++;
        //         }
        //     }
        // }
        // return cnt;

        // Optimal Solution
        // The key observation is this: Two prefix sums having the same remainder when divided by k means the subarray between them has a sum divisible by k.
        // So instead of checking all  subarrays,we just need to count how many prefix sums have the same remainder.
        int n = nums.length;
        int cnt = 0;
        Map<Integer,Integer> map = new HashMap<>();
        // Since 0 is always divisible doesn't matter the k
        map.put(0,1);
        int prefixSum = 0;
        for(int num : nums){
            prefixSum += num;
            int rem = prefixSum%k;
            if(rem<0) rem+=k;
            if(map.containsKey(rem)){
                cnt += map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return cnt;
    }
}