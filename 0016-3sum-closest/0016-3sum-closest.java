class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int sum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<n-2;i++){
            int s=i+1;
            int e=n-1;
            while(s<e){
                int currSum=nums[i]+nums[s]+nums[e];
                if(Math.abs(currSum-target)<Math.abs(sum-target)){
                    sum=currSum;
                }
                if(currSum==target){
                    return currSum;
                }else if(currSum<target){
                    s++;
                }else{
                    e--;
                }
            }
        }
        return sum;
    }
}