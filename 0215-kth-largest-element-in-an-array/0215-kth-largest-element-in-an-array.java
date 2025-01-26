class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int x:nums){
            pq.add(x);
        }
        int t=k-1;
        while(t>0){
            pq.poll();
            t--;
        }
        return pq.peek();
    }
}