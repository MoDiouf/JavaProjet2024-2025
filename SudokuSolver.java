public class SudokuSolver {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage : java SudokuSolver <fichier_grille.txt>");
            return;
        }

        try {
            SudokuGrid sudokuGrid = new SudokuGrid(args[0]);
            System.out.println("📌 Grille initiale :");
            sudokuGrid.displayGrid();

            SudokuSolverEngine solver = new SudokuSolverEngine(sudokuGrid.getGrid());
            if (solver.solve()) {
                System.out.println("✅ Solution trouvée :");
                sudokuGrid.displayGrid();
            } else {
                System.out.println("❌ Impossible de résoudre cette grille !");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
