class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1.0;
        if (n < 0) {
            x = 1 / x; 
            n = -n;    
        }
        double half=myPow(x,n/2);
        double ans=half*half;
        if(n<0) ans=1/ans;
        if(n%2==1) return x*ans;
        return ans;
    }
}