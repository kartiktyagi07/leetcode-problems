class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % nums.length;
        arrRotate(nums,0,n-k-1);
        arrRotate(nums,n-k,n-1);
        arrRotate(nums,0,n-1);
    }
    public void arrRotate(int[] nums,int i,int j){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}