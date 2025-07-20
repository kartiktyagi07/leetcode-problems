class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double[][] time = new double[n][2];

        // Store position and time as double
        for (int i = 0; i < n; i++) {
            time[i][0] = position[i];
            time[i][1] = (double)(target - position[i]) / speed[i];
        }

        // Sort by position descending (closer to target first)
        Arrays.sort(time, (a, b) -> Double.compare(b[0], a[0]));

        int ans = 0;
        double prevTime = 0.0;

        // Count fleets
        for (int i = 0; i < n; i++) {
            double currTime = time[i][1];
            if (currTime > prevTime) {
                prevTime = currTime;
                ans++;
            }
        }

        return ans;
    }
}
