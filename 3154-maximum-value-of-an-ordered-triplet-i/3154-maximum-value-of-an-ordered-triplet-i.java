class Solution {
    public long maximumTripletValue(int[] nums) {
        // O(N^3) BRUTE FORCE
        // long ans=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         for(int k=j+1;k<nums.length;k++){
        //             long val=(long)(nums[i] - nums[j]) * nums[k];
        //             System.out.println(val);
        //             ans=Math.max(ans,val);
        //         }
        //     }
        // }
        // return ans>0?ans:0;



        // O(N^2) find prefixxmax before i and suffixmax after i 
        long ans=0;
        int n=nums.length;
        for(int i=1;i<n-1;i++){
            int prefixMax=Integer.MIN_VALUE;
            for(int j=0;j<i;j++){
                prefixMax=Math.max(prefixMax,nums[j]);
            }
            int suffixMax=Integer.MIN_VALUE;
            for(int k=i+1;k<n;k++){
                suffixMax=Math.max(suffixMax,nums[k]);
            }
            long val=(long)(prefixMax - nums[i]) * suffixMax;
            ans=Math.max(ans,val);
        }
        return ans>0?ans:0;
    }
}