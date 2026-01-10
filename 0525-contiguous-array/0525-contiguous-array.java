class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++){
            sum += (nums[i] == 0 ? -1 : 1);
            if(map.containsKey(sum)){
                ans = Math.max(i - map.get(sum),ans);
            }
            map.putIfAbsent(sum,i);
        }
        return ans;
    }
}