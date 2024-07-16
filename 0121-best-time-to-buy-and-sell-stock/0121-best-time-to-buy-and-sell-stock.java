class Solution {
    public int maxProfit(int[] p) {
        // In this question we need to track the day of minimum buying and maxmimum selling.
        // if you selling on ith day then you must buy it on the minimum price from start to (i-1) to maximize profit
        int cost=0;
        int profit=0;
        int min=p[0];
        for(int i=1;i<p.length;i++){
            cost=p[i]-min;
            profit=Math.max(profit,cost);
            min=Math.min(min,p[i]);
        }
        return profit;
    }
}