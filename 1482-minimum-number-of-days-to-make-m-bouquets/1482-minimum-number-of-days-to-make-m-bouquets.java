class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(m*k > n) return -1;
        int ans = -1;
        int low = 0;
        int high = 0;
        for(int i:bloomDay){
            high = Math.max(high,i);
        }
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(isPossible(bloomDay,m,k,mid)){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public boolean isPossible(int[] bloomDay,int m,int k,int mid){
        int cnt = 0;
        int flower = 0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i] <= mid){
                flower++;
                if(flower == k){
                    cnt++;
                    flower = 0;
                }
            }else{
                flower = 0;
            }
        }
        return cnt >= m;
    }
}