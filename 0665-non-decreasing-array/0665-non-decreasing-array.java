class Solution {
    public boolean checkPossibility(int[] nums) {
        // check for direct violation if cnt>1 return false
        // edge case id cnt==1 then we can replace nums[i] or nums[i+1]
        int cnt = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                cnt++;
                if (cnt > 1) {
                    return false;
                }
                if (i == 0 || nums[i - 1] <= nums[i + 1]) {
                    nums[i] = nums[i + 1];
                } else {
                    nums[i + 1] = nums[i];
                }
            }

        }
        return true;
    }
}