class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        // O(N^2) gives TLE
        // int ans=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         int sum=nums[i]+nums[j];
        //         if(sum>=lower && sum<=upper){
        //             ans++;
        //         }
        //     }
        // }
        // return ans;



        // Method 2 using sorting
        Arrays.sort(nums);
        long ans=0;
        for(int i=0;i<nums.length;i++){
            long low=lb(nums,i+1,nums.length-1,lower-nums[i]);
            long high=lb(nums,i+1,nums.length-1,upper-nums[i]+1);
            ans+=1*(high-low);
        }
        return ans;
    }
    public static int lb(int[] nums,int low,int high,int ele){
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=ele){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}