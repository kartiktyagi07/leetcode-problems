class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        // Brute Force
        int[][] matrix = new int[n][n];
        for(int[] que : queries){
            for(int i=que[0];i<=que[2];i++){
                for(int j=que[1];j<=que[3];j++){
                    matrix[i][j]+=1;
                }
            }
        }
        return matrix; 
    }
}