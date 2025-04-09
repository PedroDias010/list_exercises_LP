import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double note1;
        double note2;

        Scanner in = new Scanner(System.in);

        System.out.println("-->CALCULA A MÉDIA DE DUAS NOTAS COM PESOS DIFERENTES<--");
        System.out.println("Digite a primeira nota: ");
        note1 = in.nextDouble();
        System.out.println("Digite a segunda nota: ");
        note2 = in.nextDouble();

        if (note1>10 || note2>10){
            System.out.println("As notas inseridas devem ser menor ou igual a 10");
        }
        else {
            System.out.println("A média das duas notas inseridas é : " + ((note1 * 1) + (note2 * 2)) / 3);
            }
    }
}
