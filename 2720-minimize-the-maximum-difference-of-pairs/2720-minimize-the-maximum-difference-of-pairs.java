class Solution {
    public int minimizeMax(int[] nums, int p) {
        if(p==0){
            return 0;
        }
        Arrays.sort(nums);
        int l=0;
        int r=nums[nums.length-1]-nums[0];
        while(l<r){
            int mid=l+(r-l)/2;
            if(helper(nums,mid,p)){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
    public static boolean helper(int[] nums,int x,int p){
        int i=0;
        int cnt=0;
        while(i<nums.length-1){
            if((nums[i+1]-nums[i])<=x){
                i++;
                cnt++;
            }
            i++;
        }
        return cnt>=p;
    }
}