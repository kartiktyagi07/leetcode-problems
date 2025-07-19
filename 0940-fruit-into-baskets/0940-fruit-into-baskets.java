class Solution {
    public int totalFruit(int[] fruits) {
        int ans=0;
        int n=fruits.length;
        if(n==1) return 1;
        int s=0;
        int e=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(e<n){
            while(map.size()>2){
                if(map.get(fruits[s])==1){
                    map.remove(fruits[s]);
                }else{
                    map.put(fruits[s],map.get(fruits[s])-1);
                }
                s++;
            }
            map.put(fruits[e],map.getOrDefault(fruits[e],0)+1);
            if(map.size()<=2){
                ans=Math.max(ans,e-s+1);
            }
            e++;
        }
        return ans;
    }
}