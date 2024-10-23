class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int i=0;i<n;i++){
            dp[0][i]=1;
        }
        for(int j=0;j<m;j++){
            dp[j][0]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
    
}

// RECURSIVE SOLUTION IT WILL GIVE TLE
// class Solution {
//     public int uniquePaths(int m, int n) {
//         ArrayList<String> cnt=path(1,1,m,n);
//         return cnt.size();
//     }
//     public static ArrayList<String> path(int a,int b,int c,int d){
//         if(a==c && b==d){
//             ArrayList<String> bref=new ArrayList<>();
//             bref.add("");
//             return bref;
//         }
//         ArrayList<String> hpath=new ArrayList<>();
//         ArrayList<String> vpath=new ArrayList<>();
//         if(a<c){
//             vpath=path(a+1,b,c,d);
//         }
//         if(b<d){
//             hpath=path(a,b+1,c,d);
//         }
//         ArrayList<String> ans=new ArrayList<>();
//         for(String rstr:vpath){
//             ans.add("v"+rstr);
//         }
//         for(String str:hpath){
//             ans.add("h"+str);
//         }
//         return ans;
//     }
// }