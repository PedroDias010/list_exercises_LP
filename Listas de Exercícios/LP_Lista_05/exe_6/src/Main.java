public class Main {
    public static void main(String[] args) {

        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        System.out.println("Vetor original:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }


        int auxiliar;
        int fim = vetor.length - 1;

        for (int inicio = 0; inicio < vetor.length / 2; inicio++) {

            // Troca elementos usando a variável auxiliar

            auxiliar = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = auxiliar;
            fim--;
        }


        System.out.println("\n\nVetor invertido:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}