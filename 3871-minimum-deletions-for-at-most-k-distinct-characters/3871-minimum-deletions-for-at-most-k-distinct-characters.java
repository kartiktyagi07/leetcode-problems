class Solution {
    public int minDeletion(String s, int k) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        ArrayList<Integer> list=new ArrayList<>(map.values());
        Collections.sort(list);
        if(list.size()<=k) return 0;
        int ans=0;
        int remove=list.size()-k;
        for(int i=0;i<remove;i++){
            ans+=list.get(i);
        }
        return ans;
    }
}