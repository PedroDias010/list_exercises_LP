import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar apenas o maior e o menor
        int maior, menor;

        // Solicita o primeiro número e inicializa maior e menor com ele
        System.out.print("Digite o 1º número: ");
        int numero = scanner.nextInt();
        maior = numero;
        menor = numero;

        // Loop para os próximos 4 números
        for (int i = 2; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = scanner.nextInt();

            // Atualiza o maior se o número atual for maior
            if (numero > maior) {
                maior = numero;
            }
            // Atualiza o menor se o número atual for menor
            if (numero < menor) {
                menor = numero;
            }
        }

        // Exibe os resultados
        System.out.println("Maior número digitado: " + maior);
        System.out.println("Menor número digitado: " + menor);

        scanner.close();
    }
}