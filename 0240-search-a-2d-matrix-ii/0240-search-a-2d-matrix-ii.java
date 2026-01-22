class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length - 1;
        int rowStart = 0;
        int colStart = col;
        while(rowStart < row && colStart >= 0){
            int current = matrix[rowStart][colStart];
            if(current == target){
                return true;
            }else if(current > target){
                colStart--;
            }else{
                rowStart++;
            }
        }
        return false;
    }
}