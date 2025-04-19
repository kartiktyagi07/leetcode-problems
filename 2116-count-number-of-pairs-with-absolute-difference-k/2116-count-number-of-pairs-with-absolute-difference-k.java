class Solution {
    public int countKDifference(int[] nums, int k) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int diff=Math.abs(nums[i]-nums[j]);
                if(diff==k){
                    ans++;
                }
            }
        }
        return ans;
    }
}