import java.util.Scanner;

public class Main {
    public static boolean ehPalindromo(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        return verificaPalindromo(str, 0, str.length() - 1);
    }

    private static boolean verificaPalindromo(String str, int inicio, int fim) {
        if (inicio >= fim) {
            return true;
        }

        if (str.charAt(inicio) != str.charAt(fim)) {
            return false;
        }

        return verificaPalindromo(str, inicio + 1, fim - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite uma palavra ou frase para verificar se é palíndromo: ");
            String entrada = scanner.nextLine();

            boolean resultado = ehPalindromo(entrada);
            if (resultado) {
                System.out.println("\"" + entrada + "\" é um palíndromo!");
            } else {
                System.out.println("\"" + entrada + "\" não é um palíndromo.");
            }

        } catch (Exception e) {
            System.out.println("Erro: Ocorreu um problema ao processar a entrada.");
        } finally {
            scanner.close();
        }
    }
}