class Solution {
    public int[] productExceptSelf(int[] nums){
        // Prefix and suffix type approach
        int n=nums.length;

        // build a left multiplication array
        int [] leftMul=new int[n];
        leftMul[0]=nums[0];
        for(int i=1;i<n;i++){
            leftMul[i]=leftMul[i-1]*nums[i];
        }

        // build a right multiplication array
        int [] rightMul=new int[n];
        rightMul[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            rightMul[i]=rightMul[i+1]*nums[i];
        }

        // Building the answer
        for(int i=0;i<n;i++){
            int left=i>0?leftMul[i-1]:1;
            int right=i<n-1?rightMul[i+1]:1;
            nums[i]=left*right;
        }
        return nums;
    }
}