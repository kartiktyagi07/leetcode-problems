class Solution {
    public String frequencySort(String s) {
        StringBuilder sb=new StringBuilder();
        Map<Character,Integer> map=new HashMap<>();
        for(char x:s.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap =
        new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        maxHeap.addAll(map.entrySet());
        while(!maxHeap.isEmpty()){
            Map.Entry<Character,Integer> entry=maxHeap.poll();
            char ch=entry.getKey();
            int fre=entry.getValue();
            for(int i=0;i<fre;i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}