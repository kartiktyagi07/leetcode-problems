class Solution {
    public long maximumTripletValue(int[] nums) {
        // O(N^2) find prefixxmax before i and suffixmax after i 
        // but it gives tle 
        // long ans=0;
        // int n=nums.length;
        // for(int i=1;i<n-1;i++){
        //     int prefixMax=Integer.MIN_VALUE;
        //     for(int j=0;j<i;j++){
        //         prefixMax=Math.max(prefixMax,nums[j]);
        //     }
        //     int suffixMax=Integer.MIN_VALUE;
        //     for(int k=i+1;k<n;k++){
        //         suffixMax=Math.max(suffixMax,nums[k]);
        //     }
        //     long val=(long)(prefixMax - nums[i]) * suffixMax;
        //     ans=Math.max(ans,val);
        // }
        // return ans>0?ans:0;



        // O(N) solution
        int n=nums.length;
        if(n<3) return 0;
        int[] prefix=new int[n];
        int[] suffix=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=Math.max(prefix[i-1],nums[i]);
        }
        suffix[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i]=Math.max(suffix[i+1],nums[i]);
        }
        long ans=0;
        for(int i=1;i<n-1;i++){
            ans=Math.max(ans,(long)(prefix[i-1] - nums[i]) * suffix[i+1]);
        }
        return ans>0?ans:0;
    }
}