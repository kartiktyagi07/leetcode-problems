class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        helper(nums,n,0,ans,new ArrayList<>());
        return ans;
    }
    public void helper(int[] nums,int n,int idx,List<List<Integer>> ans,List<Integer> temp){
        if(idx==n){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[idx]);
        helper(nums,n,idx+1,ans,temp);
        temp.remove(temp.size()-1);
        helper(nums,n,idx+1,ans,temp);
    }
}