import java.util.Arrays;
class Solution {
    public int maximumBeauty(int[] nums, int k) {
        if(nums.length==1) return 1;
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int[] ans=new int[max+1];
        for(int i=0;i<nums.length;i++){
           ans[Math.max(nums[i]-k,0)]++;
           ans[Math.min(nums[i]+k+1,max)]--;
        }
        int cs=0;
        int ms=0;
        for(int i=0;i<ans.length;i++){
            cs=cs+ans[i];
            ms=Math.max(ms,cs);
        }
        return ms;
    }
}