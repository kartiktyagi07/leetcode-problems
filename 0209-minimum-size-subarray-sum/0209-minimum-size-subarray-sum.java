class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans=Integer.MAX_VALUE;
        int left=0;
        int currSum=0;
        int n=nums.length;
        for(int right=0;right<n;right++){
            currSum+=nums[right];
            while(currSum>=target){
                ans=Math.min(ans,right-left+1);
                currSum-=nums[left];
                left++;
            }
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}