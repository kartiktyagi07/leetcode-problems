class Solution {
    public boolean isPowerOfThree(int n) {
    //METHOD 1 ITERATIVE APPROACH     
        // if(n<=0) return false;
        // while(n%3==0){
        //     n=n/3;
        // }
        // return n==1;

    // METHOD 2 SINGLE LINE CHECK 
        // return n > 0 && 1162261467 % n == 0; 




    // METHOD 3 RECURSIVE APPROACH
    if(n<=0) return false;
    if(n==1) return true;
    if(n>1)  return n%3==0 && isPowerOfThree(n/3);
    else return false;

    }
}