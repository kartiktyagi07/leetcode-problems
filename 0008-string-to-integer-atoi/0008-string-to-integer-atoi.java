class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.isEmpty()) return 0;
        boolean isNegative = s.charAt(0) == '-' ? true : false;
        boolean isPositive = s.charAt(0) == '+' ? true : false;
        int idx;
        long ans = 0;
        if(isNegative || isPositive){
            idx = 1;
        }else{
            idx = 0;
        }
        while(idx < s.length()){
            char ch = s.charAt(idx);
            if(ch < '0' || ch > '9'){
                break;
            }
            int val = ch - '0';
            ans = ans*10 + val; 
            if (isNegative && -ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if (!isNegative && ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            idx++;
        }
        return isNegative ? (int)-ans : (int)ans;
    }
}