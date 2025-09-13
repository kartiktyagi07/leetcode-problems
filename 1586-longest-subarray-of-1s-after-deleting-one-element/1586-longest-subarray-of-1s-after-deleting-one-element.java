class Solution {
    public int longestSubarray(int[] nums) {
        int ans = 0;
        int i = 0;
        int j = 0;
        int cnt = 1;
        int n = nums.length;
        while(j<n){
            if(nums[j]==0) cnt--;
            while(cnt<0){
                if(nums[i]==0){
                    cnt++;
                }
                i++;
            }
            ans = Math.max(ans,j-i);
            j++;
        }
        return ans;
    }
}