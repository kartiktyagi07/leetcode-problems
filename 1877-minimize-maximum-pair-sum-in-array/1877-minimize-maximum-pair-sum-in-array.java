class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        int maxSum = 0;
        while(i < j){
            int currSum = nums[i] + nums[j];
            if(currSum > maxSum){
                maxSum = currSum;
            }
            i++;
            j--;
        }
        return maxSum;
    }
}