import java.util.Arrays;

public class Insertion_Sort {

    public static void main(String[] args) {

        int[] vetor = {3, 4, 9, 2, 5, 8, 2, 1, 7};
        System.out.println("Vetor para ser ordenado: " + Arrays.toString(vetor));
        for (int i = 1; i < vetor.length; i++) {

            int index = i;
            int temp = 0;
            while (index > 0 && vetor[index] < vetor[index - 1]) {

                temp = vetor[index - 1];
                vetor[index - 1] = vetor[index];
                vetor[index] = temp;
                index--;

                System.out.println(Arrays.toString(vetor));
            }
        }
    }
}