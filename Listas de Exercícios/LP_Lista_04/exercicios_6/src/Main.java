import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os dois números
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        // Determina o menor e o maior número
        int inicio = Math.min(numero1, numero2);
        int fim = Math.max(numero1, numero2);

        // Verifica se há números naturais entre eles
        if (fim - inicio <= 1) {
            System.out.println("Não há números naturais entre " + numero1 + " e " + numero2 + ".");
        } else {
            System.out.println("Números naturais entre " + numero1 + " e " + numero2 + ":");
            // Exibe os números naturais entre inicio e fim (exclusive)
            for (int i = inicio + 1; i < fim; i++) {
                // Garante que só exiba números naturais (≥ 0)
                if (i >= 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println(); // Nova linha no final
        }

        scanner.close();
    }
}