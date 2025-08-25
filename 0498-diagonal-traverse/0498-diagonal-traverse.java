class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        // Edge case
        if(mat==null || mat.length==0){
            return new int[0];
        }
        // No. of rows
        int m=mat.length;
        // No. od cols 
        int n=mat[0].length;
        // Boolean falg, true for up and false for down
        boolean flag=true;
        // Result array
        int[] ans=new int[m*n];
        // Starting row and col
        int row=0,col=0;

        for(int i=0;i<m*n;i++){
            ans[i]=mat[row][col];
            if(flag){  // moving up-right
                if(col==n-1){  // reached last column
                    row++;
                    flag=false;
                }else if(row==0){  // reached top row
                    col++;
                    flag=false;
                }else{  //move upward
                    row--;
                    col++;
                }
            }else{ // moving down-left
                if(row==m-1){  // reached last row
                    col++;
                    flag=true;
                }else if(col==0){  // reached first column
                    row++;
                    flag=true;
                }else{  //move downward
                    row++;
                    col--;
                }
            }
        }
        return ans;
    }
}