import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio da base do cone: ");
        double raio = scanner.nextDouble();

        System.out.print("Digite a altura do cone: ");
        double altura = scanner.nextDouble();

        // Calcular o volume: V = (1/3) * π * r² * h
        double volume = (1.0/3.0) * Math.PI * Math.pow(raio, 2) * altura;

        System.out.printf("O volume do cone é: %.2f unidades cúbicas%n", volume);

        scanner.close();
    }
}