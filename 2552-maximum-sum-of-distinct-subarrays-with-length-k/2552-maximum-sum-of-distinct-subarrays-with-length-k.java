class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max=0;
        long currSum=0;
        HashSet<Integer> set=new HashSet<>();
        int j=0;
        for(int i=0;i<nums.length;i++){
            while(set.contains(nums[i])){
                set.remove(nums[j]);
                currSum-=nums[j];
                j++;
            }
            set.add(nums[i]);
            currSum+=nums[i];
            if(i-j+1==k){
                max=Math.max(max,currSum);
                set.remove(nums[j]);
                currSum-=nums[j];
                j++;
            }
        }
        return max;
    }
}