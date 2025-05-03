class Solution {
    public int bestClosingTime(String customers) {
        int n=customers.length();

        // Find all prefix N for any index i(0 to i-1 tk total N)
        int[] prefixArr=new int[n+1];
        prefixArr[0]=0;
        for(int i=1;i<=n;i++){
            prefixArr[i]=prefixArr[i-1]+(customers.charAt(i-1)=='N'?1:0);
        }

        // Find all suffix Y for any index i(i to n-1 tk total Y);
        int[] suffixArr=new int[n+1];
        suffixArr[n]=0;
        for(int i=n-1;i>=0;i--){
            suffixArr[i]=suffixArr[i+1]+(customers.charAt(i)=='Y'?1:0);
        }

        // The penalty for any index i is the prefix of N and suffix of
        // Y till n. Now we need to minimize this
        int ans=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=n;i++){
            if(min>prefixArr[i]+suffixArr[i]){
                min=prefixArr[i]+suffixArr[i];
                ans=i;
            }
        }
        return ans;

    }
}