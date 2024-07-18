class Solution {
    public void rotate(int[][] m) {
       for(int i=0;i<m.length;i++){
        for(int j=i+1;j<m[0].length;j++){
            int temp=m[i][j];
            m[i][j]=m[j][i];
            m[j][i]=temp;
        }
       } 
       for(int i=0;i<m.length;i++){
        int s=0;
        int e=m.length-1;
        while(s<=e){
            int temp=m[i][s];
            m[i][s]=m[i][e];
            m[i][e]=temp;
            s++;
            e--;
        }

       }
    }
}