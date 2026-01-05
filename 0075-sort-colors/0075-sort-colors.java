class Solution {
    public void sortColors(int[] nums) {
        int s = 0,m = 0,e = nums.length-1;
        while(m <= e){
            if(nums[m] == 0){
                swap(nums,s,m);
                s++;
                m++;
            }else if(nums[m] == 1){
                m++;
            }else{
                swap(nums,m,e);
                e--;
            }
        }
    }
    public void swap(int[] nums,int s,int e){
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
    }
}