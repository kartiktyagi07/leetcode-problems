class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = new int[2];
        int n = grid.length;
        Set<Integer> set = new HashSet<>();
        int totalSum = 0;
        int setSum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!set.contains(grid[i][j])){
                    set.add(grid[i][j]);
                    setSum += grid[i][j];
                }
                totalSum += grid[i][j];
            }
        }
        // Repeating Number
        ans[0] = (totalSum - setSum);
        // Finding missing number
        for(int i=1;i<=n*n;i++){
            if(!set.contains(i)){
                ans[1] = i;
                break;
            }
        }
        return ans;
    }
}