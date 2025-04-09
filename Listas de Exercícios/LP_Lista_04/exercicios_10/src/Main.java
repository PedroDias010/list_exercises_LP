import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número de termos ao usuário
        System.out.print("Digite o número de termos da sequência de Fibonacci: ");
        int n = scanner.nextInt();

        // Valida a entrada
        if (n <= 0) {
            System.out.println("Por favor, digite um número maior que 0.");
        } else {
            System.out.println("Sequência de Fibonacci com " + n + " termos:");

            // Usando for para gerar a sequência
            long anterior = 0; // Primeiro termo
            long atual = 1;    // Segundo termo

            // Imprime o primeiro termo
            if (n >= 1) {
                System.out.print(anterior);
            }

            // Imprime o segundo termo, se aplicável
            if (n >= 2) {
                System.out.print(", " + atual);
            }

            // Gera os termos restantes usando for
            for (int i = 3; i <= n; i++) {
                long proximo = anterior + atual;
                System.out.print(", " + proximo);
                anterior = atual;
                atual = proximo;
            }
            System.out.println(); // Nova linha após a sequência

            // Usando while para gerar a mesma sequência (demonstração alternativa)
            System.out.println("Mesma sequência usando while:");
            anterior = 0;
            atual = 1;
            int contador = 1;

            // Imprime o primeiro termo
            if (n >= 1) {
                System.out.print(anterior);
            }

            // Gera a sequência com while
            while (contador < n) {
                if (contador >= 1) {
                    System.out.print(", ");
                }
                if (contador == 1) {
                    System.out.print(atual);
                } else {
                    long proximo = anterior + atual;
                    System.out.print(proximo);
                    anterior = atual;
                    atual = proximo;
                }
                contador++;
            }
            System.out.println(); // Nova linha após a sequência
        }

        scanner.close();
    }
}