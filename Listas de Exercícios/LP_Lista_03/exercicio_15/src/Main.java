import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o valor inserido pelo usuário
        System.out.print("Insira o dinheiro: ");
        double valorInserido = scanner.nextDouble();

        // Exibe o menu com as opções e preços
        System.out.println("------------------------------");
        System.out.println("Menu:");
        System.out.println("    1. Café Expresso R$ 0,50");
        System.out.println("    2. Café Longo R$ 1,00");
        System.out.println("    3. Capuccino R$ 2,50");
        System.out.println("    4. Chocolate R$ 2,00");
        System.out.println("------------------------------");

        // Solicita a opção do usuário
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        System.out.println("------------------------------");

        // Define os preços das bebidas
        double precoCafeExpresso = 0.50;
        double precoCafeLongo = 1.00;
        double precoCapuccino = 2.50;
        double precoChocolate = 2.00;

        // Processa a opção escolhida
        String bebidaSelecionada = "";
        double precoBebida = 0;
        boolean opcaoValida = true;

        switch (opcao) {
            case 1: // Café Expresso
                bebidaSelecionada = "Café Expresso";
                precoBebida = precoCafeExpresso;
                break;
            case 2: // Café Longo
                bebidaSelecionada = "Café Longo";
                precoBebida = precoCafeLongo;
                break;
            case 3: // Capuccino
                bebidaSelecionada = "Capuccino";
                precoBebida = precoCapuccino;
                break;
            case 4: // Chocolate
                bebidaSelecionada = "Chocolate";
                precoBebida = precoChocolate;
                break;
            default:
                opcaoValida = false;
                System.out.println("Opção inválida! Escolha um número entre 1 e 4.");
                break;
        }

        // Calcula e exibe o troco se a opção for válida
        if (opcaoValida) {
            if (valorInserido >= precoBebida) {
                double troco = valorInserido - precoBebida;
                System.out.println("Bebida selecionada: " + bebidaSelecionada);
                System.out.printf("Seu Troco: R$ %.2f%n", troco);
            } else {
                System.out.println("Valor insuficiente para comprar " + bebidaSelecionada);
                System.out.printf("Faltam R$ %.2f%n", precoBebida - valorInserido);
            }
        }

        scanner.close();
    }
}