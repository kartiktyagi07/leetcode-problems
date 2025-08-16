class Solution {

    // Main function called to solve the Sudoku
    public void solveSudoku(char[][] board) {
        // Start solving the board using backtracking
        solve(board);

        // Print the solved Sudoku (for debugging / revision)
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Recursive function to solve Sudoku using backtracking
    public boolean solve(char[][] board) {
        // Traverse through all cells of the board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // If cell is empty ('.'), we need to fill it
                if (board[i][j] == '.') {
                    // Try placing numbers '1' to '9'
                    for (char ch = '1'; ch <= '9'; ch++) {
                        // Check if placing 'ch' here is valid
                        if (isValid(board, i, j, ch)) {
                            // Place the number temporarily
                            board[i][j] = ch;

                            // Recursively try to solve rest of the board
                            if (solve(board)) return true;

                            // If not solvable, backtrack (undo the choice)
                            else board[i][j] = '.';
                        }
                    }
                    // If no number 1–9 works, return false (dead end)
                    return false;
                }
            }
        }
        // If we reach here, it means the entire board is filled correctly
        return true;
    }

    // Function to check whether placing 'val' at (row, col) is valid
    public boolean isValid(char[][] board, int row, int col, char val) {
        for (int i = 0; i < 9; i++) {
            // Check column (same col, all rows)
            if (board[i][col] == val) return false;

            // Check row (same row, all cols)
            if (board[row][i] == val) return false;

            // Check 3x3 sub-grid
            // Formula maps (row, col) into its 3x3 box
            int subRow = 3 * (row / 3) + i / 3;
            int subCol = 3 * (col / 3) + i % 3;
            if (board[subRow][subCol] == val) return false;
        }
        // If no conflicts found → placement is valid
        return true;
    }
}
