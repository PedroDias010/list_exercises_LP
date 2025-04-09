import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibe o menu
        System.out.println("=== Menu Caixa Eletrônico ===");
        System.out.println("5 - Saldo");
        System.out.println("6 - Depósito");
        System.out.println("7 - Saque");
        System.out.println("8 - Transferência");
        System.out.println("9 - Sair");

        // Solicita a opção
        System.out.print("Digite sua opção (5-9): ");
        int opcao = scanner.nextInt();

        // Valida e processa a opção
        if (opcao >= 5 && opcao <= 9) {
            switch (opcao) {
                case 5:
                    System.out.println("Opção escolhida: Saldo");
                    break;
                case 6:
                    System.out.println("Opção escolhida: Depósito");
                    break;
                case 7:
                    System.out.println("Opção escolhida: Saque");
                    break;
                case 8:
                    System.out.println("Opção escolhida: Transferência");
                    break;
                case 9:
                    System.out.println("Opção escolhida: Sair");
                    break;
            }
        } else {
            System.out.println("Opção inválida! Por favor, escolha um número entre 5 e 9.");
        }
    }
}