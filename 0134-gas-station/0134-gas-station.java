class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalGas = 0;
        int totalCost = 0;
        for(int i:gas){
            totalGas+=i;
        }
        for(int i:cost){
            totalCost+=i;
        }
        if(totalCost>totalGas) return -1;
        int ans = 0;
        int fuelLeft = 0;
        int idx = 0;
        while(idx<n){
            fuelLeft += (gas[idx]-cost[idx]);
            if(fuelLeft<0){
                ans = idx+1;
                fuelLeft = 0;
            }
            idx++;
        }
        return ans;
    }
}