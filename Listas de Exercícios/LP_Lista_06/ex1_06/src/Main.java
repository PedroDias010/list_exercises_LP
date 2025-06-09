public class Main {
    public static long somaAteN(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Erro: N deve ser maior que 0");
        }
        long soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        return soma;
    }
    public static void main(String[] args) {
        try {
            System.out.println(somaAteN(2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}