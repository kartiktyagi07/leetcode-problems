class Solution {
    public int[] applyOperations(int[] nums) {
        // Approach 1 TC:O(N) SC:O(N)
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        // int[] arr=new int[nums.length];
        // int idx=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=0){
        //         arr[idx++]=nums[i];
        //     }
        // }
        // for(int i=idx;i<arr.length;i++){
        //     arr[i]=0;
        // }
        // return arr;   

        // Approach 2 TC:O(N) SC:O(1) i.e Not creating another array
        int l=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[l];
                nums[l]=temp;
                l++;
            }
        } 
        return nums;
    }
}