class Solution {
    public int countTriples(int n) {
        // Brute Force
        int cnt = 0;
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=1;i<=n;i++){
            list.add(i*i);
            set.add(i*i);
        }
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(set.contains(list.get(i)+list.get(j))){
                    cnt+=2;
                }
            }
        }
        return cnt;
        
    }
}