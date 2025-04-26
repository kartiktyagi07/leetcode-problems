class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // TC:O(N^3) SC:O(1+M)

        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int newTar=target-nums[i];
            List<List<Integer>> trip=threeSum(nums,i+1,n,newTar);
            for(List<Integer> temp:trip){
                List<Integer> quad=new ArrayList<>();
                quad.add(nums[i]);
                quad.addAll(temp);
                list.add(quad);
            }
        }
        return list;
    }
    public List<List<Integer>> threeSum(int[] nums,int s,int e,int target) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=s;i<e-2;i++){
            if(i>s && nums[i]==nums[i-1]) continue;
            int l=i+1;
            int r=e-1;
            while(l<r){
                long sum=(long)nums[i]+nums[l]+nums[r];
                if(sum==target){
                    list.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while(l<r && nums[l]==nums[l+1]) l++;
                    while(l<r && nums[r]==nums[r-1]) r--;
                    l++;
                    r--;
                }else if(sum<target){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return list;
    }
}