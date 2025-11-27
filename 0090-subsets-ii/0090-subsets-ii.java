class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,0,ans,new ArrayList<>());
        return ans;
    }
    void helper(int[] nums,int idx,List<List<Integer>> ans,List<Integer> temp){
        if(idx == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        // Pick
        temp.add(nums[idx]);
        helper(nums,idx+1,ans,temp);
        temp.remove(temp.size()-1);
        // Skipping Duplicates
        int newIdx = idx + 1;
        while(newIdx < nums.length && nums[newIdx] == nums[idx]){
            newIdx++;
        }
        // Not pick
        helper(nums,newIdx,ans,temp);
    }
}