package Ex5;

import java.util.Arrays;

public class Ordenacao_Matriz {

    public static void main(String[] args) {

        int[][] matriz = {
                { 3, 2, 1 },
                { 6, 5, 4 },
                { 9, 8, 7 }
        };
        System.out.println("Vetor para ser ordenado: " + Arrays.deepToString(matriz));
        // Insertion Sort
        for (int m = 0; m < matriz.length; m++) {
            for (int i = 1; i < matriz[m].length; i++) {

                int index = i;
                int temp = 0;
                while (index > 0 && matriz[m][index] < matriz[m][index - 1]) {

                    temp = matriz[m][index - 1];
                    matriz[m][index - 1] = matriz[m][index];
                    matriz[m][index] = temp;
                    index--;

                    System.out.println(Arrays.toString(matriz[m]));
                }
            }
            System.out.println(Arrays.deepToString(matriz));
        }
    }
}
