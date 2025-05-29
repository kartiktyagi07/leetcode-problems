class Solution {
    public boolean checkXMatrix(int[][] grid) {
        // O(n^2)
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                if((i==j) || (i+j==grid.length-1)){
                    if(grid[i][j]==0){
                        return false;
                    }
                }else{
                    if(grid[i][j]!=0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}