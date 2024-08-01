class Solution {
    public int divide(int dividend, int divisor) {
        // edge case
        if(dividend==divisor){
            return 1;
        }
        // true for positive and false for negative
        boolean flag=true;
        // keeping the flag to check the answer if it is positive or negative 
        if(dividend>=0 && divisor<0){
            flag=false;
        }else if(dividend<0 && divisor>0){
            flag=false;
        }
        long n=Math.abs((long)dividend);
        long d=Math.abs((long)divisor);
        divisor=Math.abs(divisor);
        long ans=0;
        while(n>=d){
            int cnt=0;
            while(n>=(d<<(cnt+1))){
                cnt+=1;
            }
            ans += 1<<cnt;
            n -= (d<<cnt);
        }
        if(ans==(1<<31) && flag){
            return Integer.MAX_VALUE;
        }
        if(ans==(1<<31) && !flag){
            return Integer.MIN_VALUE;
        }
        return flag?(int)ans:(int)(-ans);
    }
}