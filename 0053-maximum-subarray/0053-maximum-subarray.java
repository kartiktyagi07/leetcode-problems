class Solution {
    public int maxSubArray(int[] nums) {
        // Kadane's Algo
        int ans = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i<nums.length;i++){
            currSum += nums[i];
            ans = Math.max(ans,currSum);
            if(currSum <= 0){
                currSum = 0;
            }
        }
        return ans;





        // // Brute Force gives TLE
        // int max = Integer.MIN_VALUE;
        // int n = nums.length;
        // for (int i = 0; i < n; i++) {
        //     int currSum = 0;
        //     for (int j = i; j < n; j++) {
        //         currSum += nums[j];
        //         if (currSum >= max) {
        //             max = currSum;
        //         }
        //     }
        // }
        // return max;
    }
}