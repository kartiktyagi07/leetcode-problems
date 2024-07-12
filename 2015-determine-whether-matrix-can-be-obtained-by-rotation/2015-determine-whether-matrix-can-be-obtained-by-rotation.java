class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=1;i<=4;i++){
            if(same(mat,target)){
                return true;
            }
            mat= rotate(mat);
        }
        return false;
    }
    public int[][] rotate(int[][] mat){
        int n=mat.length;
        int m=mat[0].length;
        int[][] b=new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                b[j][n-i-1]=mat[i][j];
            }
        }
        return b;
    }
    public boolean same(int[][] mat,int[][] target){
        if(mat.length==target.length && mat[0].length==target[0].length){
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[0].length;j++){
                    if(mat[i][j]!=target[i][j]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}