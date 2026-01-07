class Solution {
    public int longestConsecutive(int[] nums) {
        int ans = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(int i : set){
            if(set.contains(i-1)) continue;
            int cnt = 1;
            int num = i;
            while(set.contains(num+1)){
                cnt++;
                num++;
            }
            ans = Math.max(ans,cnt);
        }
        return ans;
    }
}