import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Exibe o vetor original

        System.out.println("Vetor original:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        // Percorre o vetor e aplica as regras

        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) { // Índice par
                vetor[i] += 2; // Soma 2
            } else { // Índice ímpar
                vetor[i] *= 2; // Multiplica por 2
            }
        }

        // Exibe o vetor modificado

        System.out.println("Vetor modificado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
