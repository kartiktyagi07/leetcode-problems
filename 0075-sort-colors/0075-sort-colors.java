class Solution {
    public void sortColors(int[] nums) {
        // in this we first calculate all 0,1,2 and place them in matrix.
        // O(n) soloution 1
        // int cnt0=0;
        // int cnt1=0;
        // int cnt2=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==0){
        //         cnt0++;
        //     }else if(nums[i]==1){
        //         cnt1++;
        //     }else{
        //         cnt2++;
        //     }
        // }
        // for(int i=0;i<cnt0;i++){
        //     nums[i]=0;
        // }
        // for(int i=cnt0;i<cnt1+cnt0;i++){
        //     nums[i]=1;
        // }
        // for(int i=cnt1+cnt0;i<cnt2+cnt1+cnt0;i++){
        //     nums[i]=2;
        // }


        // solution 2
        // using Dutch National Flag Algorithm
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swap(nums,mid,high);
                high--;
            }
        }
    }
    public void swap(int[] nums,int start,int end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
}