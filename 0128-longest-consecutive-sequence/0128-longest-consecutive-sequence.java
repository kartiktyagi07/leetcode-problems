class Solution {
    public int longestConsecutive(int[] nums) {
        // Brute force Approach using sorting of array TC:O(NLOGN)
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int cnt=1;
        int temp=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) continue;
            if(nums[i]==nums[i-1]+1) cnt++;
            else{
                temp=Math.max(temp,cnt);
                cnt=1;
            }
        }
        temp=Math.max(temp,cnt);
        return temp;
    }
}