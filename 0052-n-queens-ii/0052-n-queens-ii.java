class Solution {
    public int totalNQueens(int n) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        int[][] arr=new int[n][n];
        paths(ans,arr,new ArrayList<>(),0);
        return ans.size();
    }
     public static void paths(ArrayList<ArrayList<Integer>> ans,int[][] arr,ArrayList<Integer> temp,int row){
        if(row==arr.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int col=0;col<arr.length;col++){
            if(Safe(arr,row,col)){
                arr[row][col]=1;
                temp.add(col);
                paths(ans,arr,temp,row+1);
                arr[row][col]=0;
                temp.remove(temp.size() - 1);
            }
        }
    }
     public static boolean Safe(int[][] arr,int row,int col){
        // vertical condition
        for(int i=row-1,j=col;i>=0;i--){
            if(arr[i][j]==1){
                return false;
            }
        }
        // left diagonal condition
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(arr[i][j]==1){
                return false;
            }
        }
        // right diagonal condition
        for(int i=row-1,j=col+1;i>=0 && j<arr.length;i--,j++){
            if(arr[i][j]==1){
                return false;
            }
        }
        return true;
    }
}