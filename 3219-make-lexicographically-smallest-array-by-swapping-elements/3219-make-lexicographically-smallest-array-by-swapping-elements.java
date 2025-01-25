class Solution {
    public int[] lexicographicallySmallestArray(int[] arr, int maxDiff) {
        int length = arr.length;
        int[] result = new int[length];
        int[][] sortedArray = new int[length][];
        for (int i = 0; i < length; i++) {
            sortedArray[i] = new int[]{arr[i], i};
        }
        Arrays.sort(sortedArray, (x, y) -> x[0] - y[0]);
        Map<Integer, Deque<Integer>> groupMap = new HashMap<>();
        int[] groupTracker = new int[length];
        int groupCount = 0;
        groupTracker[sortedArray[0][1]] = groupCount;
        groupMap.put(groupCount, new ArrayDeque<>());
        groupMap.get(groupCount).addLast(sortedArray[0][0]);
        for (int i = 1; i < length; i++) {
            if (sortedArray[i][0] - groupMap.get(groupCount).getLast() <= maxDiff) {
                groupMap.get(groupCount).addLast(sortedArray[i][0]);
                groupTracker[sortedArray[i][1]] = groupCount;
            } else {
                groupCount++;
                groupMap.put(groupCount, new ArrayDeque<>());
                groupMap.get(groupCount).addLast(sortedArray[i][0]);
                groupTracker[sortedArray[i][1]] = groupCount;
            }
        }
        for (int i = 0; i < length; i++) {
            result[i] = groupMap.get(groupTracker[i]).pollFirst();
        }
        return result;
    }
}
