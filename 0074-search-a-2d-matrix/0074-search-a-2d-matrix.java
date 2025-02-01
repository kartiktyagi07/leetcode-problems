class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int a=matrix.length;
       int b=matrix[0].length;
       int low=0;
       int high=a*b-1;
       while(low<=high){
        int mid=low+(high-low)/2;
        int row=mid/b;
        int col=mid%b;
        if(matrix[row][col]==target) return true;
        else if(matrix[row][col]>target) high=mid-1;
        else low=mid+1;
       }
       return false;
    }
}