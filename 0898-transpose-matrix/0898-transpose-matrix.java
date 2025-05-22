class Solution {
    public int[][] transpose(int[][] m) {
        int[][] new1=new int[m[0].length][m.length];
        for(int i=0;i<new1.length;i++){
            for(int j=0;j<new1[0].length;j++){
                new1[i][j]=m[j][i];
            }
        }
        return new1;
    }
}