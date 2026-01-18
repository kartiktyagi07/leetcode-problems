class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1) return x;
        int s = 0;
        int e = x;
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(mid*mid == x) return mid;
            else if((long)mid*mid > (long)x) e = mid - 1;
            else s = mid + 1;
        }
        return Math.round(e);
    }
}