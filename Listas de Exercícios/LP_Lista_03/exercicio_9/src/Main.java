public class Main {
    public static void main(String[] args) {
        // Exemplo com três valores (você pode modificar esses valores)
        double a = 5;
        double b = 5;
        double c = 5;

        // Verifica se forma um triângulo
        if (formaTriangulo(a, b, c)) {
            // Determina o tipo do triângulo
            if (a == b && b == c) {
                System.out.println("É um triângulo equilátero");
            } else if (a == b || b == c || a == c) {
                System.out.println("É um triângulo isósceles");
            } else {
                System.out.println("É um triângulo escaleno");
            }
        } else {
            System.out.println("Não é possível formar um triângulo com esses valores");
        }
    }

    // Método para verificar a condição de existência de um triângulo
    public static boolean formaTriangulo(double a, double b, double c) {
        // Verifica se todos os lados são positivos
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }

        // Condição de existência: cada lado deve ser menor que a soma dos outros dois
        // e maior que a diferença entre eles
        boolean cond1 = (a < (b + c)) && (a > Math.abs(b - c));
        boolean cond2 = (b < (a + c)) && (b > Math.abs(a - c));
        boolean cond3 = (c < (a + b)) && (c > Math.abs(a - b));

        return cond1 && cond2 && cond3;
    }
}