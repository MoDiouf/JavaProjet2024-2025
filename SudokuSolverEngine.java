public class SudokuSolverEngine {
    private int[][] grid;

    public SudokuSolverEngine(int[][] grid) {
        this.grid = grid;
    }

    public boolean solve() {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (grid[row][col] == 0) {
                    for (int num = 1; num <= 9; num++) {
                        if (isValidMove(row, col, num)) {
                            grid[row][col] = num;
                            if (solve()) {
                                return true;
                            }
                            grid[row][col] = 0; // Backtracking
                        }
                    }
                    return false; // Aucune solution possible
                }
            }
        }
        return true; // Sudoku résolu
    }

    private boolean isValidMove(int row, int col, int num) {
        for (int i = 0; i < 9; i++) {
            if (grid[row][i] == num || grid[i][col] == num) {
                return false;
            }
        }

        int startRow = (row / 3) * 3, startCol = (col / 3) * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[startRow + i][startCol + j] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}
