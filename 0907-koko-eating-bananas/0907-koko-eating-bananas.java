class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,piles[i]);
        }
        if(h==n) return max;
        int s=1;
        int e=max;
        while(s<e){
            int mid=(s+e)/2;
            int sum=0;
            for(int i:piles){
                sum+=(i+mid-1)/mid;
            }
            if(sum<=h){
                e=mid;
            }else{
                s=mid+1;
            }
        }
        return s;
    }
}