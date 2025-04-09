import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o valor da compra
        System.out.print("Insira o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        // Exibe o menu de formas de pagamento
        System.out.println("----------------------------------");
        System.out.println("Menu:");
        System.out.println("    1. Débito");
        System.out.println("    2. Pix");
        System.out.println("    3. Crédito");
        System.out.println("----------------------------------");
        System.out.println("Escolha uma opção: ");

        // Solicita a forma de pagamento
        System.out.print("Escolha a forma de pagamento: ");
        int formaPagamento = scanner.nextInt();

        System.out.println("----------------------------------");

        // Processa a forma de pagamento
        double valorFinal = 0;
        switch (formaPagamento) {
            case 1: // Débito
                valorFinal = valorCompra * 0.95; // Desconto de 5%
                System.out.println("Débito Selecionado");
                System.out.println("----------------------------------");
                System.out.printf("Valor final da compra = " + valorFinal);
                break;

            case 2: // Pix
                valorFinal = valorCompra * 0.90; // Desconto de 10%
                System.out.println("Pix Selecionado");
                System.out.println("----------------------------------");
                System.out.printf("Valor final da compra = " +  valorFinal);
                break;

            case 3: // Crédito
                System.out.println("Crédito Selecionado");
                System.out.println("----------------------------------");
                System.out.print("Escolha o número de parcelas (1 a 10): ");
                int parcelas = scanner.nextInt();

                if (parcelas < 1 || parcelas > 10) {
                    System.out.println("Número de parcelas inválido! Deve ser entre 1 e 10.");
                } else {
                    if (parcelas <= 4) {
                        valorFinal = valorCompra * 1.02; // Taxa de 2%
                    } else {
                        valorFinal = valorCompra * 1.05; // Taxa de 5%
                    }
                    double valorParcela = valorFinal / parcelas;
                    System.out.println("----------------------------------");
                    System.out.printf("Valor final da compra: R$ %.2f%n", valorFinal);
                    System.out.printf("Parcelado em %d x R$ %.2f%n", parcelas, valorParcela);
                }
                break;

            default:
                System.out.println("Forma de pagamento inválida! Escolha entre 1 e 3.");
                break;
        }

        scanner.close();
    }
}