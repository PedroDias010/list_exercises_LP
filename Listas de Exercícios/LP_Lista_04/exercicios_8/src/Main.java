import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número ao usuário
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Verifica se o número é menor ou igual a 1
        if (numero <= 1) {
            System.out.println(numero + " não é primo.");
        } else {
            boolean ehPrimo = true;
            int divisor = 2;

            // Usa while para verificar divisores até a raiz quadrada
            while (divisor <= Math.sqrt(numero) && ehPrimo) {
                if (numero % divisor == 0) {
                    ehPrimo = false;
                }
                divisor++;
            }

            // Usa for para contar divisores (apenas para confirmação)
            int contDivisores = 0;
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    contDivisores++;
                }
            }

            // Um número primo tem exatamente 2 divisores (1 e ele mesmo)
            if (ehPrimo && contDivisores == 2) {
                System.out.println(numero + " é primo.");
            } else {
                System.out.println(numero + " não é primo.");
            }
        }

        scanner.close();
    }
}