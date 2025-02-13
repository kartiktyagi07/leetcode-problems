class Solution {
    public int minOperations(int[] nums, int k) {
          // METHOD 1 BRUTE FORCE

        // int cnt = 0;
        // ArrayList<Long> list = new ArrayList<>();
        // for (long num : nums) {
        //     list.add(num);
        // }
        // while (list.size() > 1 && isGreater(list, k)) {
        //     Collections.sort(list);
        //     long fval = list.get(0);
        //     long sval = list.get(1);
        //     long sum = fval * 2 + sval;
        //     list.remove(Long.valueOf(fval));
        //     list.remove(Long.valueOf(sval));
        //     list.add(sum);
        //     cnt++;
        // }
        // return cnt;




         //METHOD 2 PRIORITY QUEUE
        int cnt = 0;
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        for (long num : nums) {
            minHeap.offer(num);
        }
        while (minHeap.size() > 1 && isGreater(minHeap, k)) {
            long fval = minHeap.poll();
            long sval = minHeap.poll();
            long sum = fval * 2 + sval;
            minHeap.offer(sum);
            cnt++;
        }
        return cnt; 
    }
    public static boolean isGreater(PriorityQueue<Long> heap, int k) {
        long val = heap.peek();
        return val < k;
    }

    // public static boolean isGreater(ArrayList<Long> list, int k) {
    //     long val = Collections.min(list);
    //     return val < k;
    // }
}
