class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k>0){
            int min=getMinimumIndex(nums);
            nums[min]=nums[min]*multiplier;
            k--;
        }
        return nums;
    }
    public static int getMinimumIndex(int[] nums){
        int idx=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                idx=i;
                min=nums[i];
            }
        }
        return idx;
    }
}