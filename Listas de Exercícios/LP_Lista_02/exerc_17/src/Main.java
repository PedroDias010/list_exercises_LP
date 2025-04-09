import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade inicial (em m/s): ");
        double velocidadeInicial = scanner.nextDouble();

        System.out.print("Digite a aceleração (em m/s²): ");
        double aceleracao = scanner.nextDouble();

        System.out.print("Digite o tempo de percurso (em segundos): ");
        double tempo = scanner.nextDouble();

        // Calcular a velocidade final: v = v0 + a * t
        double velocidadeFinal = velocidadeInicial + (aceleracao * tempo);

        System.out.printf("A velocidade final do corpo é: %.2f m/s%n", velocidadeFinal);

        scanner.close();
    }
}