class Solution {
    public String frequencySort(String s) {
        // METHOD -> 1 USING MAP AND QUEUE >>> TC:O(N+MlogM) SC:O(N)

        // StringBuilder sb=new StringBuilder();
        // Map<Character,Integer> map=new HashMap<>();
        // for(char x:s.toCharArray()){
        //     map.put(x,map.getOrDefault(x,0)+1);
        // }
        // PriorityQueue<Map.Entry<Character, Integer>> maxHeap =
        // new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        // maxHeap.addAll(map.entrySet());
        // while(!maxHeap.isEmpty()){
        //     Map.Entry<Character,Integer> entry=maxHeap.poll();
        //     char ch=entry.getKey();
        //     int fre=entry.getValue();
        //     for(int i=0;i<fre;i++){
        //         sb.append(ch);
        //     }
        // }
        // return sb.toString();



        // METHOD 2 USING BUCKET SORT
        // to append characters we use stringbuilder
        StringBuilder sb=new StringBuilder(); 
        // first find all the frequencies with respect to each character 
        Map<Character,Integer> map=new HashMap<>();
        for(char x:s.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        // create a buckrt of size length+1 becoause max frequency can be
        // the length of array
        List<Character> buckets[]=new List[s.length()+1];
        // fill the bucket
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            int freq=entry.getValue();
            char ch=entry.getKey();
            if(buckets[freq]==null){
                buckets[freq]=new ArrayList<>();
            }
            buckets[freq].add(ch);
        }
        // iterate over each bucket
        for(int i=buckets.length-1;i>=1;i--){
            if(buckets[i]!=null){
                // iterate each list of the curent bucket
                for(char ch:buckets[i]){
                    // append the result i times becoz i represents
                    // frequency here
                    for(int j=0;j<i;j++){
                        sb.append(ch);
                    }
                }
            }
        }
        return sb.toString();
    }
}