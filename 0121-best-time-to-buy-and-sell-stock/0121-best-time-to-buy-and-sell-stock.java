class Solution {
    public int maxProfit(int[] prices) {
        // Brute Force using nested loops

        // int ans=0;
        // int n=prices.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         int profit=prices[j]-prices[i];
        //         ans=Math.max(ans,profit);
        //     }
        // }
        // return ans;



        // Optimized Approach
        int ans=0;
        int n=prices.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,prices[i]);
            ans=Math.max(ans,prices[i]-min);
        }
        return ans;

    }
}