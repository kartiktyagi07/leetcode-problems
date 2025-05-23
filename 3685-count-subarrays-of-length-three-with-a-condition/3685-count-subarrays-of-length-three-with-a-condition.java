class Solution {
    public int countSubarrays(int[] nums) {
        // Brute Force TC:O(N^3) SC:O(1)

        // int cnt = 0;
        // int n = nums.length;
        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         for (int k = j + 1; k < n; k++) {
        //             if (j == i + 1 && k == j + 1) {
        //                 double sum = nums[i] + nums[k];
        //                 if (sum == (double) nums[j] / 2) {
        //                     cnt++;
        //                 }
        //             }
        //         }
        //     }
        // }
        // return cnt;

        // OPTIMIZED CODE IN ONE LOOP TC:O(N) SC:O(1)
        int cnt=0;
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            int sum=nums[i]+nums[i+2];
            if(nums[i+1]==2*sum){
                cnt++;
            }
        }
        return cnt;
    }
}