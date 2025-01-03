class Solution {
    public int waysToSplitArray(int[] nums) {
       int cnt=0;
       long sum=0;
       for(int i=0;i<nums.length;i++){
        sum+=nums[i];
       } 
        long ls=0;
       for(int i=0;i<nums.length-1;i++){
        ls+=nums[i];
        long rs=sum-ls;
        if(ls>=rs){
            cnt++;
        }
       }
       Arrays.sort(nums);
       return cnt;
    }
}