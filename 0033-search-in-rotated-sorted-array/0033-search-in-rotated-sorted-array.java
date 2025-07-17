class Solution {
    public int search(int[] nums, int target) {
        int ans=-1;
        int n=nums.length;
        int s=0;
        int e=n-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(nums[mid]==target) return mid;
            if(nums[s]<=nums[mid]){
                // Left half is sorted
                if(nums[s]<=target && target<nums[mid]){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }else{
                // Right half is sorted
                if(nums[mid]<target && target<=nums[e]){
                    s=mid+1;
                }else{
                    e=mid-1;
                }
            }
        }
        return ans;
    }
}