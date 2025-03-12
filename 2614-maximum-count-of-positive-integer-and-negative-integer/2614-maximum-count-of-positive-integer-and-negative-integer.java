class Solution {
    public int maximumCount(int[] nums) {
        // Method 1 TC:O(N) SC:O(1)
        // count pos,neg and leave 0
        int pos=0,neg=0;
        for(int x:nums){
            if(x==0){
                continue;
            }else if(x>0){
                pos++;
            }else{
                neg++;
            }
        }
        return Math.max(pos,neg);
    }
}