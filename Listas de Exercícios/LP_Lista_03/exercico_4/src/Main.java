import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada das notas iniciais
        System.out.print("Digite a nota 1: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite a nota 2: ");
        double n2 = scanner.nextDouble();

        // Cálculo da média inicial
        double media = (n1 + n2) / 2;
        System.out.println("Média inicial: " + media);

        // Verificação da média inicial
        if (media >= 50) {
            System.out.println("Aprovado");
        } else {
            // Solicita nota da recuperação
            System.out.print("Digite a nota da prova de recuperação: ");
            double recuperacao = scanner.nextDouble();

            // Calcula nova média com a recuperação
            double novaMedia = (media + recuperacao) / 2;
            System.out.println("Nova média: " + novaMedia);

            // Verifica nova média
            if (novaMedia >= 50) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
}