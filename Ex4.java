package Ex4;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] Args) {

        Scanner teclado = new Scanner(System.in);

        int[] arr = new int[7];
        System.out.println("Informe 7 numeros inteiros para ordenacao!");
        for (int x = 0; x < 7; x++) {
            System.out.println("Informe o numero da posicao " + x + ": ");
            arr[x] = teclado.nextInt();
        }
        int n = 0;
        while (n <= 1 || n > 7) {
            System.out.println("Quais das primeiras 7 posições deverão ser ordenadas?");
            n = teclado.nextInt();
            if (n <= 0 && n > 7) {
                System.out.println("Reposta incorreta!");
            }
        }

        System.out.println("Insertion Sort:");
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < n; i++) {

            int index = i;
            while (index > 0 && arr[index] < arr[index - 1]) {

                int temp = arr[index - 1];
                arr[index - 1] = arr[index];
                arr[index] = temp;
                index--;

                System.out.println(Arrays.toString(arr));
            }
        }

       teclado.close();
    }
}
