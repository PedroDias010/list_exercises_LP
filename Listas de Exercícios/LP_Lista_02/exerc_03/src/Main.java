import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número real: ");

        double numero = scanner.nextDouble();

        // Calcula a quinta parte
        double quintaParte = numero / 5;

        // Exibe o resultado
        System.out.println("A quinta parte de " + numero + " é " + quintaParte);

        scanner.close();
    }
}