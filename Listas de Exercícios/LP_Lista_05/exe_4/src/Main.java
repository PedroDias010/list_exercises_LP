import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] vetor = new int[10];

        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira 10 números

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Inicializa variáveis para armazenar o maior e o menor número e suas posições

        int maior = vetor[0];
        int menor = vetor[0];
        int posicaoMaior = 0;
        int posicaoMenor = 0;

        // Percorre o vetor para encontrar o maior e o menor número

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicaoMaior = i;
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
                posicaoMenor = i;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Maior número: " + maior + " (posição " + posicaoMaior + ")");
        System.out.println("Menor número: " + menor + " (posição " + posicaoMenor + ")");


        scanner.close();
    }
}