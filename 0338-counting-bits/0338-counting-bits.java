class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        for(int i=0;i<=n;i++){
            ans[i]=setBits(i);
        }
        return ans;
    }
    public static int setBits(int n) {
        if(n==0) return 0;
        int cnt=0;
        while(n>0){
            int rmsb=n&(-n);
            n=n-rmsb;
            cnt++;
        }
        return cnt;
    }
}