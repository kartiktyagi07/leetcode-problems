class Solution {
    public int[] productQueries(int n, int[][] queries) {
        int[] power=getPower(n);
        int[] ans=new int[queries.length];
        int mod=1000000007;
        for(int i=0;i<queries.length;i++){
            int start=queries[i][0];
            int end=queries[i][1];
            long prod=1;
            for(int j=start;j<=end;j++){
                prod=(prod * power[j]) % mod;
            }
            ans[i]=(int)prod;
        }
        return ans;
    }
    public int[] getPower(int n){
        ArrayList<Integer> list=new ArrayList<>();
        int bit=1;
        while(n>0){
            if((n&1)==1){
                list.add(bit);
            }
            bit<<=1;
            n>>=1;
        }
        int[] res= new int[list.size()];
        int idx=0;
        for(int i:list){
            res[idx++]=i;
        }
        return res;
    }
}