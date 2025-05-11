package Ex8_9;

import java.util.Random;

public class GeradorVetor {

    int tamanho;
    int[] arrOrdenado;
    int[] arrInvertido;
    int[] arrAleatorio;

    public GeradorVetor(int tamanho) {
        this.tamanho = tamanho;
        this.arrOrdenado = gerarOrdenado(tamanho);
        this.arrInvertido = gerarInvertido(tamanho);
        this.arrAleatorio = gerarAleatorio(tamanho);
    }

    private int[] gerarOrdenado(int tamanho) {
        int[] vetorOrdenado = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetorOrdenado[i] = i;
        }
        return vetorOrdenado;
    }

    private int[] gerarInvertido(int tamanho) {
        int[] vetorInvertido = new int[tamanho];
        for (int i = tamanho - 1; i >= 0; i--) {
            vetorInvertido[i] = i;
        }
        return vetorInvertido;
    }

    private int[] gerarAleatorio(int tamanho) {
        Random random = new Random();
        int[] vetorAleatorio = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetorAleatorio[i] = random.nextInt(1000); // Aleatório entre 0 e 999
        }
        return vetorAleatorio;
    }

    public int getTamanho() {
        return tamanho;
    }

    public int[] getArrOrdenado() {
        return arrOrdenado;
    }

    public int[] getArrInvertido() {
        return arrInvertido;
    }

    public int[] getArrAleatorio() {
        return arrAleatorio;
    }
}