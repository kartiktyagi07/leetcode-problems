class Solution {
    public int totalNumbers(int[] digits) {
        int ans=0;
        int[] digitCount=new int[10];
        for(int i=0;i<digits.length;i++){
            digitCount[digits[i]]++;
        }
        for(int i=100;i<=999;i+=2){
            if(check(i,digitCount)){
                ans++;
            }
        }
        return ans;
    }
    public static boolean check(int n,int[] digitCount){
        int[] digitReq=new int[10];
        while(n!=0){
            int rem=n%10;
            digitReq[rem]++;
            n=n/10;
        }
        for(int i=0;i<10;i++){
            if(digitReq[i]>digitCount[i]){
                return false;
            }
        }
        return true;
    }
}