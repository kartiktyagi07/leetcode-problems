class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        // Optimized Approach
        int max = nums[0];
        int ans = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] > max) max = nums[i];
        }
        int low = 1;
        int high = max;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int sum = helper(nums,mid);
            if(sum <= threshold){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;


        // //Brute Force T.C = O(n*m) n = nums.length and m = max(nums). It gives TLE
        // int max = nums[0];
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i] > max) max = nums[i];
        // } 
        // for(int i=1;i<=max;i++){
        //     long sum = 0;
        //     for(int x: nums){
        //         sum += (x + i - 1) / i;
        //     }
        //     if((int)sum <= threshold){
        //         return i;
        //     }
        // }
        // return -1;
    }
    public int helper(int[] nums,int mid){
        long sum = 0;
        for(int i:nums){
            sum += (i + mid - 1) / mid;
        }
        return (int)sum;
    }
}