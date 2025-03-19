class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Brute Force Approach
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
        // int[] ans = new int[2];
        // for (int i = 0; i < nums.length; i++) {
        //     while (i < nums.length) {
        //         if (nums[i] == target - nums[i]) {
        //             ans[0] = i;
        //             ans[1] = j;
        //         }
        //         j++;
        //     }
        // }
        // return ans;
    }
}