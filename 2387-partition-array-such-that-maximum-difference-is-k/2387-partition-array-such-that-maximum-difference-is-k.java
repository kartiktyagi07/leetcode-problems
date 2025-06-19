class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=1;
        int min=nums[0];
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            min=Math.min(nums[i],min);
            max=Math.max(nums[i],max);
            if(max-min>k){
                ans++;
                max=nums[i];
                min=nums[i];
            }
        }
        return ans;
    }
}