class Solution {
    public int numWays(String[] words, String target) {
       int wrdlen=words[0].length();
       int tarlen=target.length();
       int freq[][]=new int[wrdlen][26];
       for(String word:words){
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            freq[i][idx]++;
        }
       }
       long dp[][]=new long[wrdlen+1][tarlen+1];
       for(int i=0;i<wrdlen+1;i++){
        Arrays.fill(dp[i],-1);
       }
       return (int)ans(0,0,freq,target,words,dp);
    }
    public static long ans(int wrdidx,int taridx,int[][] freq,String target,String words[],long dp[][]){
        if(taridx==target.length()){
            dp[wrdidx][taridx]=1;
            return 1;
        }
        if(wrdidx==words[0].length()){
            dp[wrdidx][taridx]=0;
            return 0;
        }
        if((target.length()-taridx)>(words[0].length()-wrdidx)){
            dp[wrdidx][taridx]=0;
            return 0;
        }
        if(dp[wrdidx][taridx]!=-1){
            return dp[wrdidx][taridx];
        }
        int curidx=target.charAt(taridx)-'a';
        int fr=freq[wrdidx][curidx];
        long pick=fr*ans(wrdidx+1,taridx+1,freq,target,words,dp);
        long nonpick=ans(wrdidx+1,taridx,freq,target,words,dp);
        long res=(nonpick+pick)%1000000007;
        dp[wrdidx][taridx]=res;
        return res;
    }
}