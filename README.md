🧩 JavaProjet2024-2025 : Solveur de Sudoku en ligne de commande
Ce projet est un solveur de Sudoku en Java fonctionnant en ligne de commande.
L'objectif est de charger une grille de Sudoku depuis un fichier texte, de l'afficher, de la résoudre en respectant les règles du jeu et de montrer la solution.


📌 Prérequis
Java doit être installé sur votre machine.
Pour vérifier l'installation de Java :
java version "17.0.9" 2023-10-17 LTS
Java(TM) SE Runtime Environment (build 17.0.9+11-LTS-201)
Java HotSpot(TM) 64-Bit Server VM (build 17.0.9+11-LTS-201, mixed mode, sharing)
.
├── SudokuSolver.java         // Classe principale
├── SudokuGrid.java           // Gestion de la grille (chargement, affichage)
└── SudokuSolverEngine.java   // Algorithme de backtracking (résolution)

1 - Créer un fichier grille.txt :
Exemple de contenu d'une grille Sudoku partiellement remplie 
5 3 0 0 7 0 0 0 0
6 0 0 1 9 5 0 0 0
0 9 8 0 0 0 0 6 0
8 0 0 0 6 0 0 0 3
4 0 0 8 0 3 0 0 1
7 0 0 0 2 0 0 0 6
0 6 0 0 0 0 2 8 0
0 0 0 4 1 9 0 0 5
0 0 0 0 8 0 0 7 9
2 - Compiler le projet
javac SudokuSolver.java SudokuGrid.java SudokuSolverEngine.java

3 - Executer le solveur
javac SudokuSolver.java SudokuGrid.java SudokuSolverEngine.java

