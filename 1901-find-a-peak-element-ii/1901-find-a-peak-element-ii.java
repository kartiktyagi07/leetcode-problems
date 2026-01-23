class Solution {
    public int[] findPeakGrid(int[][] mat) {
        /*Optimized Approach
        Find a peak in 2D by binary searching on columns: pick a middle column, take maximum element in it, and compare with left/right neighbors to decide the 
        direction. Move toward the larger neighbor; if both sides are smaller, you’ve found a peak.*/
        int row = mat.length;
        int col = mat[0].length;
        int left = 0;
        int right = col - 1;
        while(left <= right){
            int midCol = left + (right - left) / 2;
            // Find max in midCol so that we can take a decision
            int maxRow = 0;
            for(int r=0;r<row;r++){
                if(mat[r][midCol] > mat[maxRow][midCol]){
                    maxRow = r;
                }
            }
            int leftVal = midCol > 0 ? mat[maxRow][midCol-1] : -1;
            int rightVal = midCol < col - 1 ? mat[maxRow][midCol + 1] : -1;
            if(mat[maxRow][midCol] > leftVal && mat[maxRow][midCol] > rightVal){
                return new int[]{maxRow,midCol};
            } 
            if(rightVal > mat[maxRow][midCol]){
                left = midCol + 1;
            }else{
                right = midCol - 1;
            }
        }
        return new int[]{-1,-1};
 
        // // Brute Force
        // int a = mat.length;
        // int b = mat[0].length;
        // for(int i=0;i<a;i++){
        //     for(int j=0;j<b;j++){
        //         if(isPeak(mat,i,j)){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{-1,-1};
    }
    // public boolean isPeak(int[][] mat,int i,int j){
    //     int rows = mat.length;
    //     int cols = mat[0].length;
    //     int ele = mat[i][j];
    //     if(i>0 && mat[i-1][j] >= ele) return false;
    //     if(i<rows-1 && mat[i+1][j] >= ele) return false; 
    //     if(j>0 && mat[i][j-1] >= ele) return false;
    //     if(j<cols-1 && mat[i][j+1] >= ele) return false;
    //     return true;
    // }
}