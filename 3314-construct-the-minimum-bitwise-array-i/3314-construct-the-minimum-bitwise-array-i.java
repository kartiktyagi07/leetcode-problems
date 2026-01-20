class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans = new int[nums.size()];
        for(int i=0;i<nums.size();i++){
            ans[i] = helper(nums.get(i));
        }
        return ans;
    }
    public int helper(int x){
        int ans = -1;
        for(int j=0;j<x;j++){
            int orValue = (j) | (j + 1);
            if(orValue == x){
                ans = j;
                return ans;
            } 
        }
        return ans;
    }
}