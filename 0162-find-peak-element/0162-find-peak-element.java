class Solution {
    public int findPeakElement(int[] nums) {
        // Optimized Approach
        int n = nums.length;
        int s = 0;
        int e = n - 1;
        while(s < e){
            int mid = s + (e - s) / 2;
            if(nums[mid]>nums[mid+1]){
                e = mid;
            }else{
                s = mid + 1;
            }
        }
        return s;



        // // Brute Force
        // int n = nums.length;
        // for(int i=0;i<n-1;i++){
        //     if(nums[i]>nums[i+1]){
        //         return i;
        //     }
        // }
        // return n-1;
    }
}