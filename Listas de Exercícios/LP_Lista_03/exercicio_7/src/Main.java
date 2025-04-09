import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos coeficientes
        System.out.print("Digite o coeficiente a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o coeficiente b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o coeficiente c: ");
        double c = scanner.nextDouble();

        // Verifica se é uma equação do segundo grau (a != 0)
        if (a == 0) {
            System.out.println("Não é uma equação do segundo grau (a não pode ser 0)!");
        } else {
            // Calcula o discriminante (delta)
            double delta = b * b - 4 * a * c;

            // Verifica as raízes com base no delta
            if (delta > 0) {
                // Duas raízes reais distintas
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (delta == 0) {
                // Uma raiz real (raiz dupla)
                double x = -b / (2 * a);
                System.out.println("x1 = x2 = " + x);
            } else {
                // Delta negativo - sem raízes reais
                System.out.println("Não existem raízes reais (delta = " + delta + ")");
            }
        }
    }
}