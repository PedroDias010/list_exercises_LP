import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String word;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite sua palavra: ");
        word = in.next();
        if(ePalindromo(word))
            System.out.println("É palíndromo");
        else
            System.out.println("Não é palíndromo");
        }

        public static boolean ePalindromo(String word){
            int i=0,j=word.length()-1;
            while(i<j){
                if(word.charAt(i)!=word.charAt(j))
                    return false;
                i++;
                j--;
            }
            return true;
    }
}