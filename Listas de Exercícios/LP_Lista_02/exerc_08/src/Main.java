import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a medida em polegadas: ");
        double polegadas = scanner.nextDouble();

        // Converte de polegadas para mm
        // 1 polegada = 25.4 mm
        double milimetros = polegadas * 25.4;

        System.out.println(polegadas + " polegadas equivale a " + milimetros + " mm");

        scanner.close();
    }
}