class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = helper(nums,target,true);
        ans[1] = helper(nums,target,false);
        return ans;
    }
    public int helper(int[] nums,int target,boolean firstIndex){
        int ans = -1;
        int s = 0;
        int e = nums.length - 1;
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(nums[mid] < target){
                s = mid + 1;
            }else if(nums[mid] > target){
                e = mid - 1;
            }else{
                ans = mid;
                if(firstIndex){
                    e = mid - 1;
                }else{
                    s = mid + 1;
                }
            }
        }
        return ans;
    }
}