class Solution {
    public int maxAbsoluteSum(int[] nums) {
        // BRUTE FORCE IT WILL GIVE TLE

        // int ans=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     int currSum=0;
        //     for(int j=i;j<nums.length;j++){
        //         currSum+=nums[j];
        //         ans=Math.max(ans,Math.abs(currSum));
        //     }
        // }
        // return ans;



        // OPTIMIZED APPROACH APPROACH 2

        // KADANES FOR MAXIMUM SUBARRAY
        // int maxSum=Integer.MIN_VALUE;
        // int currSum=0;
        // for(int i=0;i<nums.length;i++){
        //     currSum+=nums[i];
        //     maxSum=Math.max(maxSum,currSum);
        //     if(currSum<=0){
        //         currSum=0;
        //     }
        // }

        // REVERSE KADANES FOR MINIMUM SUBARRAY
        // int minSum=Integer.MAX_VALUE;
        // int currminSum=0;
        // for(int i=0;i<nums.length;i++){
        //     currminSum+=nums[i];
        //     minSum=Math.min(minSum,currminSum);
        //     if(currminSum>=0){
        //         currminSum=0;
        //     }
        // }
        // return Math.max(Math.abs(maxSum),Math.abs(minSum));



        // METHOD 3
        int max=0;
        int min=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i]+max,nums[i]);
            min=Math.min(nums[i]+min,nums[i]);
            ans=Math.max(ans,Math.max(Math.abs(max),Math.abs(min)));
        }
        return ans;

    }
}  