class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int[] ans=new int[n];
        int mod=1000000007;
        Arrays.fill(ans,1);
        while(k-->0){
            for(int i=1;i<n;i++){
                ans[i]=(ans[i]+ans[i-1])%mod;
            }
        }
        return ans[n-1]%mod;
    }
}