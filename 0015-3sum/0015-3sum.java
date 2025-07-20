class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans=new HashSet<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            Map<Integer,Integer> map=new HashMap<>();
            int tar=-nums[i];
            for(int j=i+1;j<n;j++){
                int comp=tar-nums[j];
                if(map.containsKey(comp)){
                    List<Integer> temp=Arrays.asList(nums[i],comp,nums[j]);
                    Collections.sort(temp);
                    ans.add(temp);
                }
                map.put(nums[j],j);
            }
        }
        return new ArrayList<>(ans);
    }
}