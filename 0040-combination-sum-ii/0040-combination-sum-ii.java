class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(candidates);
        int n=candidates.length;
        helper(candidates,target,0,list,new ArrayList<>());
        return list;
    }
    // General pattern
    public void helper(int[] arr,int target,int idx,List<List<Integer>> ans,List<Integer> temp){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(target<0) return;
        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
            temp.add(arr[i]);
            helper(arr,target-arr[i],i+1,ans,temp);
            temp.remove(temp.size()-1);
        }
    }


    // Method -> pick and not pick

    // public void helper(int[] arr,int target,int idx,List<List<Integer>> list,int n,List<Integer> temp){
    //     if(idx==n){
    //         if(target==0){
    //             list.add(new ArrayList<>(temp));
    //         }
    //         return;
    //     }
    //     if(arr[idx]<=target){
    //         temp.add(arr[idx]);
    //         helper(arr,target-arr[idx],idx+1,list,n,temp);
    //         temp.remove(temp.size()-1);
    //     }
    //     int nextIdx = idx + 1;
    //     while (nextIdx < n && arr[nextIdx] == arr[idx]) {
    //         nextIdx++;
    //     }
    //     helper(arr,target,nextIdx,list,n,temp);
    // }
}