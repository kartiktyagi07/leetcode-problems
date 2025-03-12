class Solution {
    public int maximumCount(int[] nums) {
        // Method 1 TC:O(N) SC:O(1)
        // count pos,neg and leave 0
        // int pos=0,neg=0;
        // for(int x:nums){
        //     if(x==0){
        //         continue;
        //     }else if(x>0){
        //         pos++;
        //     }else{
        //         neg++;
        //     }
        // }
        // return Math.max(pos,neg);



        // Method 2 TC:O(NLOGN) SC:O(1)
        int pos=nums.length-ub(nums);
        int neg=lb(nums);
        return Math.max(pos,neg);
    }
    public static int lb(int[] nums){
        int s=0;
        int e=nums.length-1;
        int idx=nums.length;
        while(s<=e){
            int mid=(s+e)/2;
            if(nums[mid]<0){
                s=mid+1;
            }else if(nums[mid]>=0){
                idx=mid;
                e=mid-1;
            }
        }
        return idx;
    }
    public static int ub(int[] nums){
        int s=0;
        int e=nums.length-1;
        int idx=nums.length;
        while(s<=e){
            int mid=(s+e)/2;
            if(nums[mid]<=0){
                s=mid+1;
            }else if(nums[mid]>0){
                idx=mid;
                e=mid-1;
            }
        }
        return idx;
    }
}