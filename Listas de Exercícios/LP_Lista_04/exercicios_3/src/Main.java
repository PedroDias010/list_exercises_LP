public class Main {
    public static void main(String[] args) {
        System.out.println("Números positivos divisíveis por 4 e menores que 200:");

        // Loop de 0 até 199
        for (int i = 0; i < 200; i++) {
            // Verifica se o número é divisível por 4
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}