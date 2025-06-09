public class Main {
    public static int buscaBinaria(int[] array, int elemento) {
        if (array == null || array.length == 0) {
            return -1;
        }
        return buscaBinariaRecursiva(array, elemento, 0, array.length - 1);
    }

    private static int buscaBinariaRecursiva(int[] array, int elemento, int esquerda, int direita) {
        if (esquerda > direita) {
            return -1;
        }

        int meio = esquerda + (direita - esquerda) / 2; // Evita overflow

        if (array[meio] == elemento) {
            return meio;
        }

        if (array[meio] < elemento) {
            return buscaBinariaRecursiva(array, elemento, meio + 1, direita);
        }
        else {
            return buscaBinariaRecursiva(array, elemento, esquerda, meio - 1);
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 10, 40, 50, 60, 70};
        int elemento;

        elemento = 10;
        int resultado = buscaBinaria(array, elemento);
        System.out.println("Elemento " + elemento + " encontrado na posição: " + resultado);

        elemento = 5;
        resultado = buscaBinaria(array, elemento);
        System.out.println("Elemento " + elemento + " encontrado na posição: " + resultado);

        int[] arrayVazio = {};
        resultado = buscaBinaria(arrayVazio, 10);
        System.out.println("Elemento 10 em array vazio, posição: " + resultado);
    }
}