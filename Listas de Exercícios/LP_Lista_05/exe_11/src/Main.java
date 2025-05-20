import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando dimensões da primeira matriz

        System.out.print("Digite o número de linhas da primeira matriz: ");
        int linhasA = scanner.nextInt();
        System.out.print("Digite o número de colunas da primeira matriz: ");
        int colunasA = scanner.nextInt();

        // Solicitando dimensões da segunda matriz

        System.out.print("Digite o número de linhas da segunda matriz: ");
        int linhasB = scanner.nextInt();
        System.out.print("Digite o número de colunas da segunda matriz: ");
        int colunasB = scanner.nextInt();

        // Validando se a multiplicação é possível

        if (colunasA != linhasB) {
            System.out.println("Erro: A multiplicação de matrizes não é possível. " +
                    "O número de colunas da primeira matriz (" + colunasA +
                    ") deve ser igual ao número de linhas da segunda matriz (" + linhasB + ").");
            scanner.close();
            return;
        }


        int[][] matrizA = new int[linhasA][colunasA];
        int[][] matrizB = new int[linhasB][colunasB];
        int[][] matrizProduto = new int[linhasA][colunasB];

        // Solicitando os elementos da primeira matriz

        System.out.println("\nDigite os elementos da primeira matriz (" + linhasA + "x" + colunasA + "):");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        // Solicitando os elementos da segunda matriz

        System.out.println("\nDigite os elementos da segunda matriz (" + linhasB + "x" + colunasB + "):");
        for (int i = 0; i < linhasB; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrizB[i][j] = scanner.nextInt();
            }
        }

        // Calculando a matriz produto

        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                matrizProduto[i][j] = 0;
                for (int k = 0; k < colunasA; k++) {
                    matrizProduto[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        // Exibindo a primeira matriz

        System.out.println("\nMatriz A (" + linhasA + "x" + colunasA + "):");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println();
        }

        // Exibindo a segunda matriz

        System.out.println("\nMatriz B (" + linhasB + "x" + colunasB + "):");
        for (int i = 0; i < linhasB; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print(matrizB[i][j] + "\t");
            }
            System.out.println();
        }


        System.out.println("\nMatriz Produto (" + linhasA + "x" + colunasB + "):");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print(matrizProduto[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}