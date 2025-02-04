class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=0;
        int num=0;
        int currSum=0;
        for(int i=0;i<nums.length;i++){
            num=nums[i];
            currSum=nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(num<nums[j]){
                    currSum+=nums[j];
                    num=nums[j];
                }
                else{
                    break;
                }
            }
            sum=Math.max(sum,currSum);
        }
        return sum;
    }
}