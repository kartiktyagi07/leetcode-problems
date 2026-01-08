class Solution {
    public int maxProduct(int[] nums) {
        // Brute Force
        int ans = nums[0];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int curr = 1;
            for (int j = i ; j < n; j++) {
                curr *= nums[j];
                ans = Math.max(ans, curr);
            }
        }
        return ans;
    }
}