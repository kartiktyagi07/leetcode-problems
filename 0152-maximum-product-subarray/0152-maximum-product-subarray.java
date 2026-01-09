class Solution {
    public int maxProduct(int[] nums) {
        /* Optimized Solution Greedy two pass approach first left to right
        then right to left*/
        int ans = Integer.MIN_VALUE;
        int prod = 1;
        for(int i=0;i<nums.length;i++){
            prod *= nums[i];
            ans = Math.max(ans,prod);
            if(prod == 0) prod = 1;
        }
        prod = 1;
        for(int i=nums.length-1;i>=0;i--){
            prod *= nums[i];
            ans = Math.max(ans,prod);
            if(prod == 0) prod = 1;
        }
        
        return ans;
        // // Brute Force 
        // int ans = nums[0];
        // int n = nums.length;
        // for (int i = 0; i < n; i++) {
        //     int curr = 1;
        //     for (int j = i ; j < n; j++) {
        //         curr *= nums[j];
        //         ans = Math.max(ans, curr);
        //     }
        // }
        // return ans;
    }
}