public class Main {
    public static void main(String[] args) {
        System.out.println("Tabuadas de 1 a 10:");
        System.out.println("--------------------------------");

        for (int j = 0; j <= 10; j++) {
            for (int i = 1; i <= 10; i++) {
                int resultado = i * j;
                System.out.printf("%4d", resultado); // 4 espaços para cada número
            }
            System.out.println(); // Nova linha após cada multiplicador
        }

        System.out.println("--------------------------------");
    }
}