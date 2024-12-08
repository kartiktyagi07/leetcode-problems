class Solution {
    public int maxTwoEvents(int[][] events) {
       PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
       Arrays.sort(events,(a,b)->a[0]-b[0]);
       int prev=0;
       int max=0;
       for(int event[]:events){
        while(!pq.isEmpty() && pq.peek()[1]<event[0]){
            prev=Math.max(prev,pq.peek()[2]);
            pq.poll();
        }
        max=Math.max(max,prev+event[2]);
        pq.offer(event);
       } 
       return max;
    }
}