class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans=new int[2];
        int n=grid.length;
        int x=n*n;
        int setSum=0;
        int as=0;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                as+=grid[i][j];
                if(!set.contains(grid[i][j])){
                    setSum+=grid[i][j];
                    set.add(grid[i][j]);
                }
            }
        }
        int es=x*(x+1)/2;
        ans[0]=as-setSum;
        ans[1]=es-setSum;
        return ans;
    }
}