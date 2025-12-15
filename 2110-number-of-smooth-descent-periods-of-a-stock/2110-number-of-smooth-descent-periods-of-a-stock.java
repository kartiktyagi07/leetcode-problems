class Solution {
    public long getDescentPeriods(int[] prices) {
        // Optimized Solution
        int n = prices.length;
        long cnt = 0;
        int i = 0;
        while(i < n){
            int idx = i;
            while(idx < n-1 && prices[idx] == prices[idx+1] + 1){
                idx++;
            }
            long len = idx - i + 1;
            cnt += (len * (len+1))/2;
            i = idx + 1;
        }
        return cnt;


        // Brute Force passed 167/168 

        // long cnt = 0;
        // int n = prices.length;
        // for(int i=0;i<n-1;i++){
        //     int idx = i;
        //     boolean flag = false;
        //     // Condition is true
        //     if(prices[i] == prices[i+1] + 1){
        //         flag = true;
        //         // Do calculations
        //         while(idx < n-1 && prices[idx] == prices[idx+1] + 1){
        //             idx++;
        //         }
        //     }
        //     if(flag){
        //         cnt += (idx-i);
        //         flag = !flag;
        //     }
        // }
        // return cnt + prices.length;
    }
}