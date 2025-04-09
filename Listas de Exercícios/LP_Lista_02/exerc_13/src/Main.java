import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double radius, area;

        Scanner in = new Scanner(System.in);
        radius = in.nextDouble();

        area = Math.PI * Math.pow(radius,2);
        System.out.println("Area = " + area);
    }
}