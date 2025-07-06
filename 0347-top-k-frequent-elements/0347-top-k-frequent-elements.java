class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> minHeap=new PriorityQueue<>(
        (a,b)-> a.getValue()-b.getValue());
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            minHeap.offer(entry);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        int[] ans=new int[k];
        int idx=0;
        while(minHeap.size()!=0){
            ans[idx++]=minHeap.poll().getKey();
        }
        return ans;
    }
}