class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        // This give incorrect result becoz (1,2) and (3,0) have sum 3
        // but they are not equivalent pair 
        // Map<Integer,Integer> map=new HashMap<>();
        // int n=dominoes.length;
        // for(int i=0;i<n;i++){
        //     int sum=dominoes[i][0]+dominoes[i][1];
        //     map.put(sum,map.getOrDefault(sum,0)+1);
        // }
        // int cnt=0;
        // for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        //     int val=entry.getValue();
        //     if(val>1){
        //         cnt+=(val*(val-1))/2;
        //     }
        // }
        // return cnt;


        // Approach 2 Here we generate the number instead of sum
        // TC:O(N) SC:O(1)
        Map<Integer,Integer> map=new HashMap<>();
        int n=dominoes.length;
        for(int i=0;i<n;i++){
            int a=dominoes[i][0];
            int b=dominoes[i][1];
            int key=Math.min(a,b)*10 + Math.max(a,b);
            map.put(key,map.getOrDefault(key,0)+1);
        }
        int cnt=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int val=entry.getValue();
            if(val>1){
                cnt+=(val*(val-1))/2;
            }
        }
        return cnt;
    }
}