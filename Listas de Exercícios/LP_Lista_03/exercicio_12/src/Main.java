import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicita os dois números
        System.out.print("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();

        // Exibe o menu
        System.out.println("------------------------------");
        System.out.println("Menu:");
        System.out.println("    1. Soma");
        System.out.println("    2. Subtracao");
        System.out.println("    3. Multiplicacao");
        System.out.println("    4. Divisao");
        System.out.println("------------------------------");

        // Solicita a opção do usuário
        System.out.print("Escolha uma opcao: ");
        int opcao = scanner.nextInt();

        // Fecha o scanner
        scanner.close();

        // Variável para armazenar o resultado
        double resultado = 0;
        boolean operacaoValida = true;

        // Realiza a operação escolhida
        switch (opcao) {
            case 1: // Soma
                resultado = num1 + num2;
                System.out.println("------------------------------");
                System.out.printf("Resultado: %.1f + %.1f = %.1f%n", num1, num2, resultado);
                break;
            case 2: // Subtração
                resultado = num1 - num2;
                System.out.println("------------------------------");
                System.out.printf("Resultado: %.1f - %.1f = %.1f%n", num1, num2, resultado);
                break;
            case 3: // Multiplicação
                resultado = num1 * num2;
                System.out.println("------------------------------");
                System.out.printf("Resultado: %.1f x %.1f = %.1f%n", num1, num2, resultado);
                break;
            case 4: // Divisão
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("------------------------------");
                    System.out.printf("Resultado: %.1f / %.1f = %.1f%n", num1, num2, resultado);
                } else {
                    System.out.println("------------------------------");
                    System.out.println("Erro: Divisão por zero não é permitida!");
                }
                break;
            default:
                operacaoValida = false;
                System.out.println("------------------------------");
                System.out.println("Opção inválida! Escolha um número entre 1 e 4.");
                break;
        }
    }
}