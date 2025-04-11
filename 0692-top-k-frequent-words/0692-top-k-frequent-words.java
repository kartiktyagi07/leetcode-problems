class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> ans=new ArrayList<>();
        Map<String,Integer> map=new HashMap<>();
        for(String x:words){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        PriorityQueue<Map.Entry<String,Integer>> queue=new PriorityQueue<>(
        (a,b)->a.getValue().equals(b.getValue())?a.getKey().compareTo(b.getKey()):
        b.getValue()-a.getValue()
        );
        queue.addAll(map.entrySet());
        for(int i=0;i<k && !queue.isEmpty();i++){
            ans.add(queue.poll().getKey());
        }
        return ans;
    }
}