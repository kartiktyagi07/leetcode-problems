class Solution {
    public int[] productExceptSelf(int[] nums) {

        // int[] ans=new int[nums.length];
        // int prod=1;
        // int temp=1;
        // for(int i=0;i<nums.length;i++){
        //    ans[i]=prod;
        //    prod*=nums[i];
        // }
        // for(int i=nums.length-1;i>=0;i--){
        //    ans[i]*=temp;
        //    temp*=nums[i];
        // }
        // return ans;



        // Approach 2 prefix Sum like approach
        // TC:O(N) SC:O(N)
        int n=nums.length;
        
        // Calculate left multiplication array 
        int[] leftMul=new int[n];
        leftMul[0]=nums[0];
        for(int i=1;i<n;i++){
           leftMul[i]=leftMul[i-1]*nums[i];
        }

        // Calculate right multiplication array
        int[] rightMul=new int[n];
        rightMul[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            rightMul[i]=rightMul[i+1]*nums[i];
        }

        // Filling the answer in nums
        for(int i=0;i<n;i++){
            int left=i>0?leftMul[i-1]:1;
            int right=i<n-1?rightMul[i+1]:1;
            nums[i]=left*right;
        } 
        return nums;
    }
    
}