class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        int[][] arr=new int[n][n];
        paths(ans,arr,new ArrayList<>(),0);
        return ans;
    }
    public static void paths(List<List<String>> ans,int[][] arr,List<String> temp,int row){
        if(row==arr.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        StringBuilder sb=new StringBuilder();
        for(int col=0;col<arr.length;col++){
            if(Safe(arr,row,col)){
                arr[row][col]=1;
                for (int j = 0; j < arr.length; j++) {
                    sb.append(arr[row][j] == 1 ? 'Q' : '.');
                }
                temp.add(sb.toString());
                paths(ans,arr,temp,row+1);
                temp.remove(temp.size() - 1);
                arr[row][col]=0;
            }
            sb.setLength(0);
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