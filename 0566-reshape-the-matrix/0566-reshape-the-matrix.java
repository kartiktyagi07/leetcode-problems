class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length != r*c){
            return mat;
        }
        int[][] ans=new int[r][c];
        int sc=0;
        int sr=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(sc==c){
                    sr++;
                    sc=0;
                }
                ans[sr][sc]=mat[i][j];
                sc++;
            }
        }
        return ans;
    }
}