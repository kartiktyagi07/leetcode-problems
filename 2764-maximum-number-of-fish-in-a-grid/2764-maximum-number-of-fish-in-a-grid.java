class Solution {
    public int findMaxFish(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxFish = 0;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0 && !visited[i][j]) {
                    int fishInRegion = dfs(i, j, grid, visited);
                    maxFish = Math.max(maxFish, fishInRegion);
                }
            }
        }
        return maxFish;
    }
    public int dfs(int r, int c, int[][] grid, boolean[][] visited) {
            int fishCaught = grid[r][c];
            int[] directions = {0, 1, 0, -1, 1, 0, -1, 0};
            visited[r][c] = true;
            for (int i = 0; i < 4; i++) {
                int nr = r + directions[i];
                int nc = c + directions[i + 4];
                if (nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length &&
                    !visited[nr][nc] && grid[nr][nc] > 0) {
                    fishCaught += dfs(nr, nc, grid, visited);
                }
            }
            return fishCaught;
        }
}
