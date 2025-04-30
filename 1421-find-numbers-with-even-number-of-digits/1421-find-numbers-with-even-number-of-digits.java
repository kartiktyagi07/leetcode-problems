class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        int ans=0;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            temp=nums[i];
            count=(int)(Math.log10(temp))+1;
            if(count%2==0){
                ans++;
            }
        }
        return ans;
        
    }
}