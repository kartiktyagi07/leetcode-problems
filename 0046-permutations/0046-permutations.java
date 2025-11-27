class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>();
       boolean[] used = new boolean[nums.length];
       helper(nums,used,ans,new ArrayList<>());
       return ans; 
    }
    void helper(int[] nums,boolean[] used,List<List<Integer>> ans,List<Integer> temp){
        if(temp.size() == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!used[i]){
                used[i] = true;
                temp.add(nums[i]);
                helper(nums,used,ans,temp);
                temp.remove(temp.size()-1);
                used[i] = false;
            }
        }
    }
}