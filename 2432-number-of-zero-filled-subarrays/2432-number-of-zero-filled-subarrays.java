class Solution {
    public long zeroFilledSubarray(int[] nums) {
        // Method 1 TC:O(N) SC:O(1)

        // int start=0;
        // int end=0;
        // long ans=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==0){
        //         start=i;
        //         end=i+1;
        //         while(end<nums.length && nums[end]==0){
        //             end++;
        //         }
        //         int n=end-start;
        //         ans += (long) n * (n + 1) / 2;
        //         i=end-1;
        //     }
        // }
        // return ans;
        

        // Method 2 TC:O(N) SC:O(1)
        long ans=0;
        long cnt=0;
        for(int num:nums){
            if(num==0){
                cnt++;
                ans+=cnt;
            }else{
                cnt=0;
            }
        }
        return ans;

    }
}