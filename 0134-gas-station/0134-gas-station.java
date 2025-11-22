class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        int idx = 0;
        int n = gas.length;
        int gasSum=0,costSum=0;
        for(int i=0;i<n;i++){
            gasSum += gas[i];
            costSum += cost[i];
        }
        if(gasSum < costSum) return -1;
        for(int i=0;i<n;i++){
            sum += gas[i];
            sum -= cost[i];
            if(sum < 0){
                sum = 0;
                idx = i + 1;
            }
        }
        return idx;
    }
}