import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o coeficiente a: ");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("O coeficiente 'a' não pode ser zero em uma equação do primeiro grau.");
        } else {

            System.out.print("Digite o coeficiente b: ");
            double b = scanner.nextDouble();

            // Calcular a solução: x = -b / a
            double x = -b / a;

            System.out.printf("A solução da equação %.2fx + %.2f = 0 é: x = %.2f%n", a, b, x);
        }

        scanner.close();
    }
}