import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        // Converte de Celsius para Fahrenheit
        // Fórmula: °F = (°C × 9/5) + 32
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + "°C equivale a " + fahrenheit + "°F");

        scanner.close();
    }
}