public class Main {
    public static void main(String[] args) {
        System.out.println("Tabela de Conversão Celsius para Fahrenheit");
        System.out.println("---------------------------------------");
        System.out.printf("%10s | %10s%n", "Celsius", "Fahrenheit");
        System.out.println("---------------------------------------");

        // Loop de -80 até 80 com incremento de 10
        for (int celsius = -80; celsius <= 80; celsius += 10) {
            // Converte para Fahrenheit: F = (9/5) * C + 32
            double fahrenheit = (9.0 / 5.0) * celsius + 32;

            // Exibe os valores formatados
            System.out.printf("%10d | %10.1f%n", celsius, fahrenheit);
        }

        System.out.println("---------------------------------------");
    }
}