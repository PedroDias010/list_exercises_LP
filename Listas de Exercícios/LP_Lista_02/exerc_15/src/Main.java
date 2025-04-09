import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double circle;
        double height;

        Scanner in = new Scanner(System.in);

        System.out.println("-->CALCULA A ÁREA DE UM CILINDRO<--");
        System.out.println("Digite o raio em cm do cilindro: ");
        circle = in.nextDouble();
        System.out.println("Digite a altura em cm do cilindro: ");
        height = in.nextDouble();

        double areacircle = Math.PI * Math.pow(circle, 2);
        System.out.println("A área do cilindro é: " + ((areacircle)*height) + " cm²");
    }
}