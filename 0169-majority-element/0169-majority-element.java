class Solution {
    public int majorityElement(int[] nums) {
        // -------->BRUTE FORCE<--------

        // int max=(int)Math.floor(nums.length/2);
        // int ans=0;
        // for(int i=0;i<nums.length;i++){
        //     int count=0;
        //     int tar=nums[i];
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[j]==tar){
        //             count++;
        //         }
        //     }
        //     if(count>max){
        //         ans=tar;
        //         return ans; 
        //     }
        // }
        // return ans;


        // ------->OPTIMIZED APPROACH<-------
        // MOORE VOTING ALGORITHM
        int ans=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                ans=nums[i];
            }
            if(nums[i]==ans){
                count++;
            }else{
                count--;
            }
        }
        return ans;
    }
}