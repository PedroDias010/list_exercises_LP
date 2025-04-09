import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada das notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        // Cálculo da média
        double media = (nota1 + nota2) / 2;
        System.out.println("Média: " + media);

        // Determinação do conceito
        if (media >= 8.5) {
            System.out.println("Conceito: A");
        } else if (media >= 7 && media < 8.5) {
            System.out.println("Conceito: B");
        } else if (media >= 5 && media < 7) {
            System.out.println("Conceito: C");
        } else {
            System.out.println("Conceito: D");
        }
    }
}