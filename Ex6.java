package Ex6;

import java.util.Arrays;

public class Ex6 {

    public static void main(String[] args) {

        int[] vetor = {250, 300, 150, 400, 350};
        System.out.println("Pontuacoes para serem ordenadas: " + Arrays.toString(vetor));
        System.out.println(Arrays.toString(vetor));
        for (int i = 1; i < vetor.length; i++) {

            int index = i;
            int temp = 0;
            while (index > 0 && vetor[index] > vetor[index - 1]) {

                temp = vetor[index - 1];
                vetor[index - 1] = vetor[index];
                vetor[index] = temp;
                index--;

                System.out.println(Arrays.toString(vetor));
            }

            System.out.println("Pontuacao Mais Alta: " + vetor[0]);
        }

        System.out.println("Pontuacoes Ordenadas: " + Arrays.toString(vetor));
        System.out.println("Pontuacao Mais Alta: " + vetor[0]);
    }
}