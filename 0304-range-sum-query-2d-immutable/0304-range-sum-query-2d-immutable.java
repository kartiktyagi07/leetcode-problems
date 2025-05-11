class NumMatrix {
    int[][] mat;
    public NumMatrix(int[][] matrix) {
        mat=new int[matrix.length+1][matrix[0].length+1];
        for(int i=1;i<=matrix.length;i++){
            for(int j=1;j<=matrix[0].length;j++){
                mat[i][j]=matrix[i-1][j-1]+mat[i-1][j]+mat[i][j-1]-mat[i-1][j-1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        // It is Brute Force Approach

        // int sum=0;
        // for(int i=row1;i<=row2;i++){
        //     for(int j=col1;j<=col2;j++){
        //         sum+=mat[i][j];
        //     }
        // }
        // return sum;


        // Optimized Approach using prefix sum array
        return mat[row2+1][col2+1] - mat[row1][col2+1] -mat[row2+1][col1] + mat[row1][col1]; 
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */