import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler input do usuário
        Scanner scanner = new Scanner(System.in);

        // Pede a distância em milhas
        System.out.print("Digite a distância em milhas: ");
        double milhas = scanner.nextDouble();

        // Converte de milhas para km
        // 1 milha = 1.609344 km
        double quilometros = milhas * 1.609344;

        // Exibe o resultado
        System.out.println(milhas + " milhas equivale a " + quilometros + " km");

        // Fecha o scanner
        scanner.close();
    }
}