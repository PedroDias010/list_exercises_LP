import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria um objeto Scanner para leitura de entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e armazena o número do usuário
        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = scanner.nextInt();

        // Exibe a tabuada do número de 0 a 10
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        // Fecha o scanner
        scanner.close();
    }
}