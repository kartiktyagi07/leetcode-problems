class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] ans=new int[m][n];
        int[] colMax=new int[n];
        for(int i=0;i<n;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<m;j++){
                max=Math.max(max,matrix[j][i]);
            }
            colMax[i]=max;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==-1){
                    ans[i][j]=colMax[j];
                }else{
                    ans[i][j]=matrix[i][j];
                }
            }
        }
        return ans;
    }
}