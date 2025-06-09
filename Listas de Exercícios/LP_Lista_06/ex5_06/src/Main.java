public class Main {
    public static int buscaBinaria(int[] array, int elemento) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int esquerda = 0;
        int direita = array.length - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2; // Evita overflow em arrays grandes

            if (array[meio] == elemento) {
                return meio;
            }
            if (array[meio] < elemento) {
                esquerda = meio + 1;
            }
            else {
                direita = meio - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 10, 40, 50, 60, 70};
        int elemento;

        elemento = 10;
        int resultado = buscaBinaria(array, elemento);
        System.out.println("Elemento " + elemento + " encontrado na posição: " + resultado);

    }
}