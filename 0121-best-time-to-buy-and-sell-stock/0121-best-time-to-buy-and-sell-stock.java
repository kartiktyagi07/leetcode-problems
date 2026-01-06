class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int n = prices.length;
        int minSoFar = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            minSoFar = Math.min(minSoFar,prices[i]);
            ans = Math.max(ans,prices[i] - minSoFar);
        }
        return ans;
    }
}