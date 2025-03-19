import java.io.*;
import java.util.*;

public class SudokuGrid {
    private int[][] grid;

    public SudokuGrid(String filename) throws IOException {
        loadGridFromFile(filename);
    }

    private void loadGridFromFile(String filename) throws IOException {
        File file = new File(filename);
        if (!file.exists()) {
            throw new FileNotFoundException("Erreur : Fichier introuvable !");
        }

        grid = new int[9][9];
        try (Scanner scanner = new Scanner(file)) {
            for (int i = 0; i < 9; i++) {
                if (!scanner.hasNextLine()) {
                    throw new IllegalArgumentException("Erreur : Nombre de lignes incorrect !");
                }
                String[] line = scanner.nextLine().trim().split("\\s+");
                if (line.length != 9) {
                    throw new IllegalArgumentException("Erreur : Nombre de colonnes incorrect !");
                }

                for (int j = 0; j < 9; j++) {
                    int value = Integer.parseInt(line[j]);
                    if (value < 0 || value > 9) {
                        throw new IllegalArgumentException("Erreur : Valeur invalide dans la grille !");
                    }
                    grid[i][j] = value;
                }
            }
        }
    }

    public int[][] getGrid() {
        return grid;
    }

    public void displayGrid() {
        System.out.println("+-------+-------+-------+");
        for (int i = 0; i < 9; i++) {
            System.out.print("| ");
            for (int j = 0; j < 9; j++) {
                System.out.print(grid[i][j] == 0 ? ". " : grid[i][j] + " ");
                if ((j + 1) % 3 == 0) System.out.print("| ");
            }
            System.out.println();
            if ((i + 1) % 3 == 0) System.out.println("+-------+-------+-------+");
        }
    }
}
