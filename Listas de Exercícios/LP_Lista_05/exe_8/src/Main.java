public class Main {
    public static void main(String[] args) {
        // Declarando e inicializando a matriz 5x5
        int[][] matriz = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        // Exibindo a matriz completa
        System.out.println("Matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Exibindo a diagonal principal
        System.out.println("\nDiagonal principal:");
        for (int i = 0; i < 5; i++) {
            System.out.print(matriz[i][i] + " ");
        }
    }
}