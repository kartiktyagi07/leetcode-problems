class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n == 1) return 1;
        int i = 0,j = 0;
        while(j<n){
            nums[i] = nums[j];
            while(j < n && nums[j] == nums[i]){
                j++;
            } 
            i++;
        }
        return i;
    }
}