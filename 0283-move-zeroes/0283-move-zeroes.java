class Solution {
    public void moveZeroes(int[] nums) {
        // Method 1
        int idx = 0;
        for(int x:nums){
            if(x != 0){
                nums[idx++] = x;
            }
        }
        while(idx < nums.length){
            nums[idx++] = 0;
        }

        // Method 2
        // int l = 0;
        // for(int r=0;r<nums.length;r++){
        //     if(nums[r] != 0){
        //         int temp = nums[l];
        //         nums[l] = nums[r];
        //         nums[r] = temp;
        //         l++;
        //     }
        // }
    }
}