import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pede e lê a primeira nota
        System.out.print("Digite a primeira nota (N1): ");
        double n1 = scanner.nextDouble();

        // Pede e lê a segunda nota
        System.out.print("Digite a segunda nota (N2): ");
        double n2 = scanner.nextDouble();

        // Calcula a média
        double media = (n1 + n2) / 2;

        System.out.println("A média das notas " + n1 + " e " + n2 + " é " + media);

        scanner.close();
    }
}