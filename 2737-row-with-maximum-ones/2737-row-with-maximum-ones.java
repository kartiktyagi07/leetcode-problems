class Solution {
    public int[] rowAndMaximumOnes(int[][] arr) {
        int[] ans={-1,-1};
        int cnt=0;
        int max=-1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==1){
                    cnt++;
                }
            }
            if(cnt>max){
                max=cnt;
                ans[0]=i;
                ans[1]=cnt;
            }
            cnt=0;
        }
        return ans;
    }
}