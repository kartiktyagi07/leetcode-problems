class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(candidates,target,0,ans,new ArrayList<>(),0);
        return ans;
    }
    void helper(int[] arr,int target,int idx,List<List<Integer>> ans,List<Integer> temp,int currSum){
        if(idx == arr.length){
            if(currSum == target){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        if(currSum <= target){
            temp.add(arr[idx]);
            helper(arr,target,idx,ans,temp,currSum+arr[idx]);
            temp.remove(temp.size()-1);
        }
        helper(arr,target,idx+1,ans,temp,currSum);
    }
}