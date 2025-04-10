class Solution {
    public int maximumGap(int[] nums) {
        // TC:O(NLOGN) due to internal sorting SC:O(1)
        int ans=0;
        int n=nums.length;
        if(n<2) return 0;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            int diff=nums[i+1]-nums[i];
            ans=Math.max(ans,diff);
        }
        return ans;
    }
}