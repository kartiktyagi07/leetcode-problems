class Solution {
    public int[] sumZero(int n) {
        if(n==1) return new int[]{0};
        int[] ans = new int[n];
        int mid = n/2;
        int cnt = 0;
        int cnt2 = 0;
        for(int i=0;i<n;i++){
            if(i<mid){
                cnt--;
                ans[i]=cnt;
            }else if(i==mid && n!=(2*mid)){
                cnt = 0;
                ans[i] = cnt;
            }else{
                cnt2++;
                ans[i] = cnt2;
            }
        }
        return ans;
    }
}