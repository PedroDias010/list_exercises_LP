import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pede a velocidade em km/h
        System.out.print("Digite a velocidade em km/h: ");
        double velocidadeKmH = scanner.nextDouble();

        // Converte de km/h para m/s
        // Fórmula: m/s = (km/h × 1000) ÷ 3600 ou km/h × (5/18)
        double velocidadeMS = velocidadeKmH * 1000 / 3600;
        // Alternativa: double velocidadeMS = velocidadeKmH * 5 / 18;

        System.out.println(velocidadeKmH + " km/h equivale a " + velocidadeMS + " m/s");

        scanner.close();
    }
}