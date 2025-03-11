class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // Two pass approach
        // int[] ans=new int[nums.length];
        // int idx=0;
        // for(int i=0;i<nums.length;i++){
        // if(nums[i]%2==0){
        // ans[idx++]=nums[i];
        // }
        // }
        // for(int i=0;i<nums.length;i++){
        // if(nums[i]%2!=0){
        // ans[idx++]=nums[i];
        // }
        // }
        // return ans;

        // One pass approach
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if(nums[i]%2!=0){
                if(nums[j]%2!=0){
                    j--;
                }else{
                    swap(nums,i,j);
                    i++;
                    j--;
                }
            }else{
                i++;
            }
        }
        return nums;
    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}