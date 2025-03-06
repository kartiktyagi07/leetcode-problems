class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        // Method 1 TC:O(N^2) SC:O(N^2)
        // int[] ans=new int[2];
        // int n=grid.length;
        // int x=n*n;
        // int setSum=0;
        // int as=0;
        // Set<Integer> set=new HashSet<>();
        // for(int i=0;i<grid.length;i++){
        //     for(int j=0;j<grid.length;j++){
        //         as+=grid[i][j];
        //         if(!set.contains(grid[i][j])){
        //             setSum+=grid[i][j];
        //             set.add(grid[i][j]);
        //         }
        //     }
        // }
        // int es=x*(x+1)/2;
        // ans[0]=as-setSum;
        // ans[1]=es-setSum;
        // return ans;

        // ethod 2 TC:O(N^2) SC:O(1)
        long n=grid.length;
        long sum=0;
        long sqrSum=0;
        long x=n*n;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum+=grid[i][j];
                sqrSum+=(long)(grid[i][j]*grid[i][j]);
            }
        }
        long sumDiff=sum-(x*(x+1))/2;
        long sqrDiff=sqrSum-(x*(x+1)*(2*x+1))/6;
        int a=(int)(sqrDiff/sumDiff + sumDiff)/2;
        int b=(int)(sqrDiff/sumDiff-sumDiff)/2;
        return new int[]{a,b};
    }
}