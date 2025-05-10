class Solution {
    public int sumDistance(int[] nums, String s, int d) {
        int mod=1000000007;
        long ans=0;
        int n=nums.length;
        // Form the final array
        long[] newNums = new long[n];
        for (int i = 0; i < n; i++) {
            newNums[i] = (long) nums[i] + (s.charAt(i) == 'R' ? d : -d);
        }
        

        Arrays.sort(newNums); 

        // Built prefixSum array
        long[] left=new long[n];
        left[0]=newNums[0];
        for(int i=1;i<n;i++){
            left[i]=left[i-1]+newNums[i];
        }

        // Use prefix array to calculate sum of distances
        for(int i=1;i<n;i++){
            long contri=(long) newNums[i]*i-left[i-1];
            ans=(ans + contri) % mod;
        }
        return (int)ans;
    }
}