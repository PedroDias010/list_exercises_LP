public class Main {
    public static void main(String[] args) {

        int[][] matrizA = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        // Declarando e inicializando a matriz 2x2

        int[][] matrizB = {
                {7, 8},
                {9, 10}
        };

        // Declarando a matriz produto (3x2)

        int[][] matrizProduto = new int[3][2];


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matrizProduto[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    matrizProduto[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        // Exibindo a matriz A (3x2)

        System.out.println("Matriz A (3x2):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println();
        }

        // Exibindo a matriz B (2x2)

        System.out.println("\nMatriz B (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizB[i][j] + "\t");
            }
            System.out.println();
        }

        // Exibindo a matriz produto (3x2)

        System.out.println("\nMatriz Produto (3x2):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizProduto[i][j] + "\t");
            }
            System.out.println();
        }
    }
}