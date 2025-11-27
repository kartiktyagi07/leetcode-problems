class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        helper(nums,0,n,list,new ArrayList<>());
        return list;
    }
    void helper(int[] nums,int idx,int n,List<List<Integer>> list,List<Integer> temp){
        if(idx == n){
            list.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[idx]);
        helper(nums,idx+1,n,list,temp);
        temp.remove(temp.size()-1);
        helper(nums,idx+1,n,list,temp);
    }
}