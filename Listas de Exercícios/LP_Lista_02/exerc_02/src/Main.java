import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler input do usuário
        Scanner scanner = new Scanner(System.in);

        // Pede ao usuário para digitar um número
        System.out.print("Digite um número inteiro: ");

        // Lê o número inteiro digitado
        int numero = scanner.nextInt();

        // Calcula o quadrado
        int quadrado = numero * numero;

        // Exibe o resultado
        System.out.println("O quadrado de " + numero + " é " + quadrado);

        // Fecha o scanner
        scanner.close();
    }
}