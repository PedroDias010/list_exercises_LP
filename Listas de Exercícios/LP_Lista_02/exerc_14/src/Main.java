import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double base;
        double altura;

        Scanner in = new Scanner(System.in);

        System.out.println("-->CALCULA A ÁREA DE UM TRIÂNGULO RETÂNGULO<--");
        System.out.println("Digite o tamanho da base em cm do triângulo: ");
        base = in.nextDouble();
        System.out.println("Digite o tamanho da altura em cm do triângulo: ");
        altura = in.nextDouble();

        System.out.println("A área do triângulo retângulo é: " +(base*altura)/2 +"cm²");
        }
}