class Solution {
    public int minMoves(int[] nums) {
        int cnt = 0;
        int max = Integer.MIN_VALUE;
        for(int i:nums){
            if(i>max){
                max = i;
            }
        }
        for(int i:nums){
            if(i != max){
                cnt += (max-i);
            }
        }
        return cnt;
    }
}