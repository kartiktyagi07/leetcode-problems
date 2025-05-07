class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        // Brute force Approach
        // TC:O(N^2) GIVES TLE

        // int n=nums.length;
        // int[] res=new int[n];
        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=0;j<n;j++){
        //         sum+=Math.abs(nums[i]-nums[j]);
        //     }
        //     res[i]=sum;
        // }
        // return res;




        // Optimized Approach TC:O(N) SC:O(N)
        int n=nums.length;
        int[] res=new int[n];
        // Building prefix sum array
        int[] prefix=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=nums[i]+prefix[i-1];
        }
        for(int i=0;i<n;i++){
            int left=nums[i]*i-(i>0?prefix[i-1]:0);
            int right=(prefix[n-1]-prefix[i])-nums[i]*(n-1-i);
            res[i]=left+right;
        }
        return res;
    }
}