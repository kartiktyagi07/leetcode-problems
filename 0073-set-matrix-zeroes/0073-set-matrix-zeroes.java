class Solution {
    public void setZeroes(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        // first we treverse through entire array and jha 0 hit hua vha function run hoga
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         if(mat[i][j]==0){
        //             row(mat,i);
        //             col(mat,j);
        //         }
        //     }
        // }
        // to change all the -1 into 0
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         if(mat[i][j]==-333374){
        //             mat[i][j]=0;
        //         }
        //     }
        // }

        //  solution 2
        int[] row=new int[n];
        int[] col=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    row[i]=-33374;
                    col[j]=-33374;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==-33374 || col[j]==-33374){
                    mat[i][j]=0;
                }
            }
        }

    }
    // to make the entire row -1 in which 0 exists
    // public void row(int[][] arr,int x){
    //     for(int j=0;j<arr[0].length;j++){
    //         if(arr[x][j]!=0){
    //             arr[x][j]=-333374;
    //         }
    //     }
    // }
    // to make the entire col -1 in which 0 exists
    // public void col(int[][] arr,int y){
    //     for(int j=0;j<arr.length;j++){
    //         if(arr[j][y]!=0){
    //             // phle minus -1 k equalle rkha tha but matrix m -1 bhi aaya to koi bhi random likhdiya
    //             arr[j][y]=-333374;
    //         }
    //     }
    // }



}