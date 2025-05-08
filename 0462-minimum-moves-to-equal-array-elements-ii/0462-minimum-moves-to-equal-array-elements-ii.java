class Solution {
    public int minMoves2(int[] nums) {
        // Brute Force 
        // use long instead of int coz cnt can cause integer overflow

        // long ans=Long.MAX_VALUE;
        // Arrays.sort(nums);
        // int n=nums.length;
        // long cnt=0;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         long diff=Math.abs((long)nums[i]-nums[j]);
        //         cnt+=diff;
        //     }
        //     ans=Math.min(cnt,ans);
        //     cnt=0;
        // }
        // return (int)ans;


        // Optimized code
        int n=nums.length;
        Arrays.sort(nums);
        int median=nums[n/2];
        long ans=0;
        for(int i=0;i<n;i++){
            ans+=Math.abs((long)nums[i]-median);
        }
        return (int)ans;
    }
}