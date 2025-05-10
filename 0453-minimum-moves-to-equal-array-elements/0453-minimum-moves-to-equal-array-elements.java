class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            if(i<min){
                min=i;
            }
            sum+=i;
        }
        int ans=sum-n*min;
        return ans;
    }
}