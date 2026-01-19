class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        int ans = Integer.MAX_VALUE;
        for(int i:piles){
            high = Math.max(i,high);
        }
        while(low <= high){
            int mid = low + (high - low) / 2;
            long timeTaken = helper(piles,mid);
            if(timeTaken <= h){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public long helper(int[] piles,int mid){
        long ans = 0;
        for(int i: piles){
            ans += (i + mid - 1) / mid;
        }
        return ans;
    }
}