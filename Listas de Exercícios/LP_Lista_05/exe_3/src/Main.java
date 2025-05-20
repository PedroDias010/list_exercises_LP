import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] vetor = {5, 12, 3, 8, 15, 7, 22, 1, 10, 4};


        Scanner scanner = new Scanner(System.in);

        // Solicita um número inteiro ao usuário

        System.out.print("Digite um número inteiro para buscar no vetor: ");
        int numero = scanner.nextInt();

        // Realiza a busca no vetor

        boolean encontrado = false;
        int posicao = -1;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                encontrado = true;
                posicao = i;
                break; // Sai do loop ao encontrar o número
            }
        }

        // Exibe o resultado

        if (encontrado) {
            System.out.println("O número " + numero + " foi encontrado na posição " + posicao + " do vetor.");
        } else {
            System.out.println("Valor não encontrado");
        }

        scanner.close();
    }
}