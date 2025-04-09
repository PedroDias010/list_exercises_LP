import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância em quilômetros (km): ");
        double quilometros = scanner.nextDouble();

        // Converte de km para milhas
        // 1 km = 0.621371 milhas
        double milhas = quilometros * 0.621371;

        System.out.println(quilometros + " km equivale a " + milhas + " milhas");

        scanner.close();
    }
}