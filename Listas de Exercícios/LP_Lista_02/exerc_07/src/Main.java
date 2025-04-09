import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a medida em milímetros (mm): ");
        double milimetros = scanner.nextDouble();

        // Converte de mm para polegadas
        // 1 polegada = 25.4 mm
        double polegadas = milimetros / 25.4;

        System.out.println(milimetros + " mm equivale a " + polegadas + " polegadas");

        scanner.close();
    }
}