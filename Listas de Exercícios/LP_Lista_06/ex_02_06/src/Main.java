import java.util.Scanner;

public class Main {
    public static long calcularFatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Erro: N deve ser maior ou igual a 0");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcularFatorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número inteiro para calcular o fatorial: ");
            int numero = scanner.nextInt();
            long fatorial = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é: " + fatorial);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (StackOverflowError e) {
            System.out.println("Erro: Stack overflow devido a recursão excessiva");
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida. Digite um número inteiro.");
        } finally {
            scanner.close();
        }
    }
}