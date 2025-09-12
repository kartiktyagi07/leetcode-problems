class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;

        // Step 1: Compute total gas and total cost
        int totalGas = 0;
        int totalCost = 0;
        for(int i : gas) totalGas += i;
        for(int i : cost) totalCost += i;

        // If total cost > total gas, completing circuit is impossible
        if(totalCost > totalGas) return -1;

        // Step 2: Greedy traversal to find valid start index
        int ans = 0;       // candidate starting index
        int fuelLeft = 0;  // current fuel balance
        int idx = 0;

        while(idx < n) {
            fuelLeft += (gas[idx] - cost[idx]); // update tank balance

            if(fuelLeft < 0) {
                // Can't reach next station → reset candidate start
                ans = idx + 1;
                fuelLeft = 0; // reset fuel
            }
            idx++;
        }

        // Step 3: Return the valid starting index
        return ans;
    }
}
