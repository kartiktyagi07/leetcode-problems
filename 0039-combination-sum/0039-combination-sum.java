class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    // General pattern in recursion + backtracking 
    public void helper(int idx,int[] arr,int target,List<List<Integer>> ans,List<Integer> temp){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(target<0) return;
        for(int i=idx;i<arr.length;i++){
            temp.add(arr[i]);
            helper(i,arr,target-arr[i],ans,temp);
            temp.remove(temp.size()-1);
        }
    }

    // Method 1 using pick and not pick but not acc. to general pattern

    // public void helper(int idx,int[] arr,int target,List<List<Integer>> ans, List<Integer> temp){
    //     if(idx==arr.length){
    //         if(target==0){
    //             ans.add(new ArrayList<>(temp));
    //         }
    //         return;
    //     }
    //     if(arr[idx]<=target){
    //         temp.add(arr[idx]);
    //         helper(idx,arr,target-arr[idx],ans,temp);
    //         temp.remove(temp.size()-1);
    //     }
    //     helper(idx+1,arr,target,ans,temp);
    // }
}