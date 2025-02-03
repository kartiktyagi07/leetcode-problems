class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int cnt=1;
        int incLen=1;
        int decLen=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                incLen++;
                decLen=1;
            }else if(nums[i]>nums[i+1]){
                decLen++;
                incLen=1;
            }else{
                incLen=1;
                decLen=1;
            }
            cnt=Math.max(cnt,Math.max(incLen,decLen));
        }
        return cnt;
    }
}