class Solution {
    public int maximumSum(int[] nums) {
        int ans = -1;
        int[] arr=new int[82];
        for(int number:nums){
            int sum=digitsSum(number);
            if(arr[sum]>0){
                int old=arr[sum];
                ans=Math.max(old+number,ans);
                arr[sum]=Math.max(old,number);
            }else{
                arr[sum]=number;
            }
        }
        return ans;
        
    }
    public static int digitsSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + (n % 10);
            n = n / 10;
        }
        return sum;
    }
}