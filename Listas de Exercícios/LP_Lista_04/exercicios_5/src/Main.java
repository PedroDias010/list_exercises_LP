import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número ao usuário
        System.out.print("Digite um número para calcular seu fatorial: ");
        int numero = scanner.nextInt();

        // Verifica se o número é negativo
        if (numero < 0) {
            System.out.println("O fatorial não é definido para números negativos.");
        } else {
            // Calcula o fatorial
            long fatorial = 1; // Usamos long para suportar valores maiores
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            // Exibe o resultado
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        scanner.close();
    }
}