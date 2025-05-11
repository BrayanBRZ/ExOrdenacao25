package Ex5;

import java.util.Arrays;

public class Classificacao_Notas {

    public static void main(String[] args) {

        int arr[] = { 85, 70, 95, 60, 75, 80 };
        System.out.println("Vetor para ser ordenado: " + Arrays.toString(arr));
        // Insertion Sort
        for (int i = 1; i < arr.length; i++) {

            int index = i;
            while (index > 0 && arr[index] < arr[index - 1]) {

                int temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
                System.out.println(Arrays.toString(arr));
            }
        }

        double mediana = calcularMediana(arr);
        System.out.println("Notas Ordenadas: " + Arrays.toString(arr));
        System.out.println("Mediana: " + mediana);

    }

    public static double calcularMediana(int[] arr) {

        // Se o número de elementos for ímpar, a mediana é o valor do meio
        int tamanho = arr.length;
        if (tamanho % 2 == 1) {
            return arr[tamanho / 2];
        } else {
            double meio1 = arr[tamanho / 2 - 1]; 
            System.out.println(arr[tamanho / 2 - 1]);
            double meio2 = arr[tamanho / 2];
            System.out.println(arr[(int) (tamanho / 2)]);
            return (meio1 + meio2) / 2;
        }
    }
};