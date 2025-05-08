class Solution {
    public long minimumRemoval(int[] beans) {
        long ans=Long.MAX_VALUE;
        int n=beans.length;
        Arrays.sort(beans);
        long totalSum=0;
        for(int i:beans){
            totalSum+=i;
        }
        for(int i=0;i<n;i++){
            int val=beans[i];
            int cnt=n-i;
            long left=totalSum-(long)val*cnt;
            ans=Math.min(ans,left);
        }
        return ans;
    }
}