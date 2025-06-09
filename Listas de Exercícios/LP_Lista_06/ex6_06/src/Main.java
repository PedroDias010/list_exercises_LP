public class Main {
    public static long somaRecursiva(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Erro: N deve ser maior que 0");
        }
        if (n == 1) {
            return 1;
        }
        return n + somaRecursiva(n - 1);
    }

    public static void main(String[] args) {
        try {
            // Testes
            System.out.println(somaRecursiva(7));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (StackOverflowError e) {
            System.out.println("Erro: Stack overflow devido a recursão excessiva");
        }
    }
}