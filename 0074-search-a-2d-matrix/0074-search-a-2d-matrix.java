class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int a = matrix.length;
        int b = matrix[0].length;
        int s = 0;
        int e = a * b - 1;
        while(s <= e){
            int mid = s + (e - s) / 2;
            int row = mid / b;
            int col = mid % b;
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] > target){
                e = mid -1;
            }else{
                s = mid + 1;
            }
        }
        return false;
    }
}