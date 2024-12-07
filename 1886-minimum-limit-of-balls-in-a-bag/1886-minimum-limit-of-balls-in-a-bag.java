class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int l=1;
        int res=0;
        while(l<=max){
            int mid=l+(max-l)/2;
            if(Possible(nums,mid,maxOperations)){
                res=mid;
                max=mid-1;
            }else{
                l=mid+1;
            }
        }
        return res;
    }
    public static boolean Possible(int[] nums,int allowed,int maxoperations){
        int operations=0;
        for(int num:nums){
            if(num>allowed){
                int bags=(int)Math.ceil(num/(double)allowed);
                operations+=bags-1;
            }
            if(operations>maxoperations){
                return false;
            }
        }
        return true;
    }
}