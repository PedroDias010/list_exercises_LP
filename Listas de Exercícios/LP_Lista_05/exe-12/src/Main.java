public class Main {
    public static void main(String[] args) {
        // Declarando e inicializando a matriz 3x3

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        System.out.println("Matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Calculando a determinante (Regra de Sarrus)

        int det = (matriz[0][0] * matriz[1][1] * matriz[2][2] +
                matriz[0][1] * matriz[1][2] * matriz[2][0] +
                matriz[0][2] * matriz[1][0] * matriz[2][1]) -
                (matriz[0][2] * matriz[1][1] * matriz[2][0] +
                        matriz[0][0] * matriz[1][2] * matriz[2][1] +
                        matriz[0][1] * matriz[1][0] * matriz[2][2]);


        System.out.println("\nDeterminante da matriz: " + det);
    }
}