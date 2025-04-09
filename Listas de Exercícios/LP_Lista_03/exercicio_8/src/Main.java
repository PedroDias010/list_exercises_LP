import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite um  número inteiro: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (number % 2 == 0){
            System.out.println("O número: " + number + " é par!");
        }
        else{
            System.out.println("O número: " + number + " é impar!");
        }
    }
