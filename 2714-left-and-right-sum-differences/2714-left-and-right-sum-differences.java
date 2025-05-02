class Solution {
    public int[] leftRightDifference(int[] nums) {
        int totalSum=FindSum(nums);
        int prefixSum=0;
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int suffixSum=totalSum-prefixSum-nums[i];
            ans[i]=Math.abs(prefixSum-suffixSum);
            prefixSum+=nums[i];
        }
        return ans;
    }
    public static int FindSum(int[] nums){
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        return sum;
    }
}