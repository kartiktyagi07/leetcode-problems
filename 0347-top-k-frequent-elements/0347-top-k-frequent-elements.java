class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = 
            new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            minHeap.offer(entry);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        int idx=0;
        int[] arr=new int[k];
        while(minHeap.size()!=0){
            arr[idx++]=minHeap.poll().getKey();
        }
        return arr;
    }
}