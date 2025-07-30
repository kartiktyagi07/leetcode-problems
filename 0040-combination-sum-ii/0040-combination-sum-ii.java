class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(candidates);
        int n=candidates.length;
        helper(candidates,target,0,list,n,new ArrayList<>());
        return list;
    }
    public void helper(int[] arr,int target,int idx,List<List<Integer>> list,int n,List<Integer> temp){
        if(idx==n){
            if(target==0){
                list.add(new ArrayList<>(temp));
            }
            return;
        }
        if(arr[idx]<=target){
            temp.add(arr[idx]);
            helper(arr,target-arr[idx],idx+1,list,n,temp);
            temp.remove(temp.size()-1);
        }
        int nextIdx = idx + 1;
        while (nextIdx < n && arr[nextIdx] == arr[idx]) {
            nextIdx++;
        }
        helper(arr,target,nextIdx,list,n,temp);
    }
}