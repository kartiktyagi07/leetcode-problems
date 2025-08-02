class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        helper(nums,n,ans,new ArrayList<>(),used);
        return ans;
    }
    public void helper(int[] nums,int n,List<List<Integer>> ans,ArrayList<Integer> temp,boolean[] used){
        if(temp.size()==n){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<n;i++){
            if(used[i]) continue;
            if(i>0 && nums[i]==nums[i-1] && !used[i-1]) continue;
            used[i]=true;
            temp.add(nums[i]);
            helper(nums,n,ans,temp,used);
            temp.remove(temp.size()-1);
            used[i]=false;
        }
    }
}