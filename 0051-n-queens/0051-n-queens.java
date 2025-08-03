class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>(); // Final list to store all valid board configurations
        int[][] mat = new int[n][n]; // Chessboard matrix to keep track of queen placements (1 = Queen, 0 = Empty)
        backtrack(mat, ans, new ArrayList<>(), 0, n); // Start backtracking from row 0
        return ans;
    }

    public void backtrack(int[][] mat, List<List<String>> ans, List<String> temp, int row, int n) {
        // Base case: all rows are filled with queens
        if (row == n) {
            ans.add(new ArrayList<>(temp)); // Add current configuration to the answer
            return;
        }

        StringBuilder sb = new StringBuilder(); // Used to build a row string like "..Q."
        for (int col = 0; col < n; col++) {
            if (isSafe(mat, row, col)) {
                mat[row][col] = 1; // Place queen at (row, col)

                // Convert current row into a string and add to temp configuration
                for (int j = 0; j < n; j++) {
                    sb.append(mat[row][j] == 1 ? 'Q' : '.');
                }
                temp.add(sb.toString());

                // Move to the next row
                backtrack(mat, ans, temp, row + 1, n);

                // Backtrack: remove queen and the corresponding row string
                temp.remove(temp.size() - 1);
                mat[row][col] = 0;
            }

            // Clear the StringBuilder before next column trial
            sb.setLength(0);
        }
    }

    public boolean isSafe(int[][] mat, int row, int col) {
        // Check vertical upward for queen
        for (int i = row - 1, j = col; i >= 0; i--) {
            if (mat[i][j] == 1) return false;
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (mat[i][j] == 1) return false;
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < mat.length; i--, j++) {
            if (mat[i][j] == 1) return false;
        }

        return true; // Safe to place queen
    }
}
