class Solution {
    public static int maximumInvitations(int[] arr) {
        int len = arr.length;

        int[] deg = new int[len];
        int[] tempQueue = new int[len];
        int[] chainLen = new int[len];

        for (int i = 0; i < len; i++) {
            deg[arr[i]]++;
        }

        int left = 0, right = 0;
        for (int i = 0; i < len; i++) {
            if (deg[i] == 0) tempQueue[right++] = i;
        }

        while (left < right) {
            int current = tempQueue[left++];
            int next = arr[current];
            chainLen[next] = Math.max(chainLen[next], chainLen[current] + 1);
            if (--deg[next] == 0) {
                tempQueue[right++] = next;
            }
        }

        int cycleTwo = 0;
        int cycleMax = 0;

        for (int i = 0; i < len; i++) {
            if (deg[i] != 0) {
                deg[i] = 0;
                int cycleCount = 1;
                for (int j = arr[i]; j != i; j = arr[j]) {
                    cycleCount++;
                    deg[j] = 0;
                }

                if (cycleCount == 2) {
                    cycleTwo += chainLen[i] + chainLen[arr[i]] + 2;
                } else {
                    cycleMax = Math.max(cycleMax, cycleCount);
                }
            }
        }

        return Math.max(cycleMax, cycleTwo);
    }
}
