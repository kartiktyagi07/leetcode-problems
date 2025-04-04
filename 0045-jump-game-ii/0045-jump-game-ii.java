class Solution {
    public int jump(int[] arr) {
        int N = arr.length;
        if (N == 1)
            return 0;
        int max = 0;
        int maxRange = 0;
        int count = 0;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, i + arr[i]);
            if (maxRange == i) {
                maxRange = max;
                count++;
            }
            if (maxRange >= N - 1) {
                return count;
            }
        }
        return -1;
    }
}