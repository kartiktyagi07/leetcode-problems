class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int a=1;a<n;a++){
            int rem = n-a;
            if(isNonZero(a) && isNonZero(rem)){
                return new int[]{a,rem};
            }
        } 
        return new int[]{-1,-1};
    }
    public boolean isNonZero(int x){
        while(x>0){
            if(x%10==0){
                return false;
            }
            x=x/10;
        }
        return true;
    }
}