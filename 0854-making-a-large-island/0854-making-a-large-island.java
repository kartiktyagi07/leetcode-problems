import java.util.*;

public class Solution {
    private static final int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int largestIsland(int[][] grid) {
        int gridSize = grid.length;
        List<Integer> islandSizes = new ArrayList<>();
        int islandId = 2;
        for (int row = 0; row < gridSize; row++) {
            for (int col = 0; col < gridSize; col++) {
                if (grid[row][col] == 1) {
                    int islandSize = exploreIsland(grid, row, col, islandId);
                    islandSizes.add(islandSize);
                    islandId++;
                }
            }
        }
        if (islandSizes.isEmpty()) return 1;
        int largestIsland = 0;
        for (int row = 0; row < gridSize; row++) {
            for (int col = 0; col < gridSize; col++) {
                if (grid[row][col] == 0) {
                    Set<Integer> adjacentIslands = new HashSet<>();
                    int potentialIslandSize = 1;
                    for (int[] direction : DIRECTIONS) {
                        int newRow = row + direction[0];
                        int newCol = col + direction[1];
                        if (newRow >= 0 && newRow < gridSize && newCol >= 0 && newCol < gridSize && grid[newRow][newCol] >= 2) {
                            int neighborIslandId = grid[newRow][newCol];
                            if (!adjacentIslands.contains(neighborIslandId)) {
                                potentialIslandSize += islandSizes.get(neighborIslandId - 2);
                                adjacentIslands.add(neighborIslandId);
                            }
                        }
                    }
                    largestIsland = Math.max(largestIsland, potentialIslandSize);
                }
            }
        }
        return largestIsland == 0 ? gridSize * gridSize : largestIsland;
    }

    private int exploreIsland(int[][] grid, int row, int col, int islandId) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] != 1) {
            return 0;
        }
        grid[row][col] = islandId;
        int islandCount = 1;
        for (int[] direction : DIRECTIONS) {
            islandCount += exploreIsland(grid, row + direction[0], col + direction[1], islandId);
        }
        return islandCount;
    }
}
