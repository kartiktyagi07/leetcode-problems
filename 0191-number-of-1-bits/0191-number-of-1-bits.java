class Solution {
    public int hammingWeight(int n) {
        int cnt=0;
        while(n!=0){
           int rmsb=n&-n;
           n=n-rmsb;
           cnt++;
        }
        return cnt;
    }
}