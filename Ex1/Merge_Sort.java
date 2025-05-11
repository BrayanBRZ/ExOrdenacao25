import java.util.Arrays;

public class Merge_Sort {

    public static void main(String[] args) {
        int[] vetor = {3, 4, 9, 2, 5, 8, 2, 1, 7};
        System.out.println("Vetor para ser ordenado: " + Arrays.toString(vetor));

        mergeSort(vetor, 0, vetor.length - 1);

        System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
    }

    public static void mergeSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;

            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);

            merge(vetor, inicio, meio, fim);
        }
    }

    public static void merge(int[] vetor, int inicio, int meio, int fim) {
        int[] temp = new int[fim - inicio + 1];

        int i = inicio;
        int j = meio + 1;
        int k = 0;

        while (i <= meio && j <= fim) {
            if (vetor[i] <= vetor[j]) {
                temp[k++] = vetor[i++];
            } else {
                temp[k++] = vetor[j++];
            }
        }

        while (i <= meio) {
            temp[k++] = vetor[i++];
        }

        while (j <= fim) {
            temp[k++] = vetor[j++];
        }

        for (i = inicio, k = 0; i <= fim; i++, k++) {
            vetor[i] = temp[k];
        }

        // Mostra o vetor após cada merge
        System.out.println("Após merge de [" + inicio + " a " + fim + "]: " + Arrays.toString(vetor));
    }
}
