import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade em m/s: ");
        double velocidadeMS = scanner.nextDouble();

        // Converte de m/s para km/h
        // Fórmula: km/h = (m/s × 3600) ÷ 1000 ou m/s × 3.6
        double velocidadeKmH = velocidadeMS * 3600 / 1000;
        // Alternativa: double velocidadeKmH = velocidadeMS * 3.6;

        System.out.println(velocidadeMS + " m/s equivale a " + velocidadeKmH + " km/h");

        scanner.close();
    }
}