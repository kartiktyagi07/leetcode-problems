class Solution {
    public int minOperations(int[] nums, int k) {
        int cnt=0;
        TreeSet<Integer> set=new TreeSet<>();
        for(int x:nums){
            set.add(x);
        }
        for(int x:set){
            if(x==k){
                continue;
            }else if(x<k){
                return-1;
            }else{
                cnt++;
            }
        }
        return cnt;
    }
}