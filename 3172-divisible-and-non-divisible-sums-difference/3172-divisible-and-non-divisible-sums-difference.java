class Solution {
    public int differenceOfSums(int n, int m) {
        // O(N)

        // int sum1=0;
        // int sum2=0;
        // for(int i=1;i<=n;i++){
        //     if(i%m==0){
        //         sum2+=i;
        //     }else{
        //         sum1+=i;
        //     }
        // }
        // return sum1-sum2;

        // O(1)
        
        int totalSum=(n*(n+1))/2;
        int k=n/m;
        int substract=k*(k+1)*m;
        return totalSum-substract;

    }
}