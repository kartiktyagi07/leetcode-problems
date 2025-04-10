class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Using Map and Queue TC:O(NlogK)

        // ArrayList<Integer> list=new ArrayList<>();
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        // PriorityQueue<Map.Entry<Integer, Integer>> minHeap = 
        //     new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        // for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        //     minHeap.offer(entry);
        //     if(minHeap.size()>k){
        //         minHeap.poll();
        //     }
        // }
        // int idx=0;
        // int[] arr=new int[k];
        // while(minHeap.size()!=0){
        //     arr[idx++]=minHeap.poll().getKey();
        // }
        // return arr;




        // Using Buckrt Sort TC:O(N)
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> buckets[]=new ArrayList[nums.length+1];
        for(int i=0;i<buckets.length;i++){
            buckets[i]=new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int key=entry.getKey();
            int val=entry.getValue();
            buckets[val].add(key);
        }
        List<Integer> list=new ArrayList<>();
        for(int i=buckets.length-1;i>=0 && list.size()<k;i--){
            for(int num:buckets[i]){
                list.add(num);
                if(list.size()==k) break;
            }
        }
        int[] arr=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}