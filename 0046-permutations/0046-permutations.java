class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        helper(nums,n,ans,new ArrayList<>());
        return ans;
    }
    public void helper(int[] nums,int n,List<List<Integer>> ans,ArrayList<Integer> temp){
        if(temp.size()==n){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i:nums){
            if(temp.contains(i)) continue;
            temp.add(i);
            helper(nums,n,ans,temp);
            temp.remove(temp.size()-1);
        }
    }
}