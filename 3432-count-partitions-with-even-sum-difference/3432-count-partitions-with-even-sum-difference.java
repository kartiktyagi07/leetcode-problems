class Solution {
    public int countPartitions(int[] nums) {
        int cnt = 0;
        int totalSum = 0;
        int currSum = 0;
        for(int i=0;i<nums.length;i++){
            totalSum += nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
            currSum += nums[i];
            int rightSum = totalSum - currSum;
            if(Math.abs(currSum - rightSum) % 2 == 0) cnt++;
        }
        return cnt;
    }
}