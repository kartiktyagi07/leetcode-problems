class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,target,0,ans,new ArrayList<>());
        return ans;
    }
    void helper(int[] arr,int target,int idx,List<List<Integer>> ans,List<Integer> temp){
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = idx ; i < arr.length;i++){
            if(i > idx && arr[i] == arr[i-1]){
                continue;
            }
            if(arr[i] > target) break;
            temp.add(arr[i]);
            helper(arr,target-arr[i],i+1,ans,temp);
            temp.remove(temp.size()-1);
        }
    }
    // Pick and not pick 
    // void helper(int[] arr,int target,int idx,List<List<Integer>> ans,List<Integer> temp){
    //     if(idx == arr.length){
    //         if(target == 0){
    //             ans.add(new ArrayList<>(temp));
    //         }
    //         return;
    //     }
    //     // Pick
    //     if(arr[idx] <= target){
    //         temp.add(arr[idx]);
    //         helper(arr,target-arr[idx],idx+1,ans,temp);
    //         temp.remove(temp.size()-1);
    //     }
    //     // Not pick
    //     while(idx+1 < arr.length && arr[idx+1] == arr[idx]){
    //         idx++;
    //     }
    //     helper(arr,target,idx+1,ans,temp);
    // }
}