class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    long val=(long)(nums[i] - nums[j]) * nums[k];
                    System.out.println(val);
                    ans=Math.max(ans,val);
                }
            }
        }
        return ans>0?ans:0;
    }
}