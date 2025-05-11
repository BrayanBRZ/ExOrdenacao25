import java.util.Arrays;

public class Bubble_Sort {

    public static void main(String[] args) {

        // Vetor de exemplo
        int[] vetor = {3, 4, 9, 2, 5, 8, 2, 1, 7};
        System.out.println("Vetor para ser ordenado: " + Arrays.toString(vetor));
        int changes;
        int x;


        // Algoritmo Bubble Sort
        for (int i = vetor.length - 1; i > 0; i--) {

            changes = 0;

            for (int j = 0; j < i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    // Troca dos elementos
                    x = vetor[j + 1];
                    vetor[j + 1] = vetor[j];
                    vetor[j] = x;

                    System.out.println("Após bubble em [" + j + "]: " + Arrays.toString(vetor));

                    changes++;  // Marca que houve uma troca
                }
            }
            if (changes <= 0) break;
        }

        // Imprime o vetor ordenado
        System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
    }
}