import java.util.Arrays;

public class Selection_Sort {

    public static void main(String[] args) {

        // Vetor de exemplo
        int[] vetor = {3, 4, 9, 2, 5, 8, 2, 1, 7};
        System.out.println("Vetor para ser ordenado: " + Arrays.toString(vetor));
        int changes;

        // Algoritmo Selection Sort
        for (int i = 0; i < vetor.length - 1; i++) {

            int indiceMenor = i;
            changes = 0;

            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            
            if (indiceMenor != i) {
                // Troca os elementos
                int temp = vetor[indiceMenor];
                vetor[indiceMenor] = vetor[i];
                vetor[i] = temp;
                changes++;
                System.out.println("Após seleção em [" + i + "]: " + Arrays.toString(vetor));
            }
            if (changes == 0) break;
        }

        // Imprime o vetor ordenado
        System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
    }
}
