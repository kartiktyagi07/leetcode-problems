class Solution {
    public int splitArray(int[] nums, int k) {
        int sum = 0;
        int ans = -1;
        for(int i:nums){
            sum += i;
        }
        int s = 0;
        int e = sum;
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(isValid(nums,mid,k)){
                ans = mid;
                e = mid - 1;
            }else{
                s = mid + 1; 
            }
        }
        return ans;
    }
    public boolean isValid(int[] nums,int maxSumAllowed,int k){
        int cnt = 1;
        int currSum = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > maxSumAllowed) return false;
            if(nums[i] + currSum <= maxSumAllowed){
                currSum += nums[i];
            }else{
                currSum = nums[i];
                cnt++;
            }
        }
        return cnt <= k;
    }
}