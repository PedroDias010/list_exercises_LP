import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jogarNovamente = true;

        // Loop principal do jogo (while para jogar novamente)
        while (jogarNovamente) {
            System.out.println("Bem-vindo ao Jogo da Tabuada!");
            boolean perdeu = false;

            // Loops aninhados para as tabuadas de 1 a 10
            for (int i = 1; i <= 10 && !perdeu; i++) {
                for (int j = 0; j <= 10 && !perdeu; j++) {
                    int resultadoCorreto = i * j;

                    // Exibe a operação
                    System.out.print(i + " x " + j + " = ");
                    int resposta = scanner.nextInt();

                    // Verifica se a resposta está correta
                    if (resposta != resultadoCorreto) {
                        System.out.println("Resposta errada! O correto é " + resultadoCorreto + ".");
                        System.out.println("Você perdeu!");
                        perdeu = true;
                    }
                }
            }

            // Verifica se o jogador venceu
            if (!perdeu) {
                System.out.println("Parabéns! Você completou todas as tabuadas sem erros!");
            }

            // Pergunta se quer jogar novamente
            System.out.print("Deseja jogar novamente? (1 para sim, 0 para não): ");
            int opcao = scanner.nextInt();
            jogarNovamente = (opcao == 1);
        }

        System.out.println("Obrigado por jogar! Até a próxima!");
        scanner.close();
    }
}