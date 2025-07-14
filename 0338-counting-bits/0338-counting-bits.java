class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        for(int i=0;i<=n;i++){
            ans[i]=helper(i);
        }
        return ans;
    }
    public int helper(int i){
        int cnt=0;
        if(i==0) return 0;
        while(i!=0){
            int rbsm=i&-i;
            i=i-rbsm;
            cnt++;
        }
        return cnt;
    }
}