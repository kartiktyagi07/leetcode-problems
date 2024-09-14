class Solution {
    public int addDigits(int num) {
        if(num<10){
            return num;
        }
        while(num>=10){
            num=sum(num);
        }
        return num;
    }
    public static int sum(int n){
        int currsum=0;
        while(n>0){
            currsum+=n%10;
            n=n/10;
        }
        return currsum;
    }
}