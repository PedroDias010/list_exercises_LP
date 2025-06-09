
import java.util.Scanner;

public class Main {
    public static long calcularPotencia(int x, int y) {
        if (y < 0) {
            throw new IllegalArgumentException("Erro: y deve ser maior ou igual a 0");
        }
        if (y == 0) {
            return 1;
        }
        return x * calcularPotencia(x, y - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o valor de x (base): ");
            int x = scanner.nextInt();
            System.out.print("Digite o valor de y (expoente): ");
            int y = scanner.nextInt();

            long potencia = calcularPotencia(x, y);
            System.out.println(x + " elevado a " + y + " é: " + potencia);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (StackOverflowError e) {
            System.out.println("Erro: Stack overflow devido a recursão excessiva");
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida. Digite números inteiros.");
        } finally {
            scanner.close();
        }
    }
}