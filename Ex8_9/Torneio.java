package Ex8_9;

import java.util.Arrays;
import java.util.Scanner;

public class Torneio {

    static Scanner teclado = new Scanner(System.in);
    static GeradorVetor vetor;
    static long tempoInicial;
    static long tempoFinal;
    static long tempoTotal;

    public static void main(String[] args) {

        gerarVetores(); // Gera os vetores inicialmente
        boolean execucao = true;

        // Loop principal do menu
        while (execucao) {
            System.out.println();
            System.out.println("MENU PRINCIPAL");
            System.out.println("Tamanho atual dos vetores: " + vetor.getTamanho());
            System.out.println("Escolha uma opção:");
            System.out.println("1. Gerar novos vetores");
            System.out.println("2. Menu Bubble Sort");
            System.out.println("3. Menu Insertion Sort");
            System.out.println("4. Menu Selection Sort");
            System.out.println("5. Menu Merge Sort");
            System.out.println("6. TORNEIO");
            System.out.println("7. Encerrar execução");

            int opcao = teclado.nextInt();
            teclado.nextLine(); // Limpeza do buffer após nextInt()

            switch (opcao) {
                case 1:
                    gerarVetores();
                    break;
                case 2:
                    menuBubble();
                    break;
                case 3:
                    menuInsertion();
                    break;
                case 4:
                    menuSelection();
                    break;
                case 5:
                    menuMerge();
                    break;
                case 6:
                    torneio();
                    break;
                case 7:
                    execucao = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void gerarVetores() {
        System.out.println("Deseja gerar vetores de que tamanho?");
        vetor = new GeradorVetor(teclado.nextInt());
        teclado.nextLine(); // Limpeza do buffer após nextInt()
    }

    ////////////////////////// BUBBLESORT //////////////////////////

    public static void menuBubble() {
        boolean execucao = true;
        while (execucao) {
            System.out.println();
            System.out.println("MENU BUBBLESORT");
            System.out.println("Tamanho atual dos vetores: " + vetor.getTamanho());
            System.out.println("Escolha uma opção:");
            System.out.println("1. Ordenar vetor ordenado");
            System.out.println("2. Ordenar vetor invertido");
            System.out.println("3. Ordenar vetor aleatório");
            System.out.println("4. Sair para o Menu Principal");

            int opcao = teclado.nextInt();
            teclado.nextLine(); // Limpeza do buffer após nextInt()

            switch (opcao) {
                case 1:
                    bubbleSort(vetor.getArrOrdenado());
                    break;
                case 2:
                    bubbleSort(vetor.getArrInvertido());
                    break;
                case 3:
                    bubbleSort(vetor.getArrAleatorio());
                    break;
                case 4:
                    execucao = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void bubbleSort(int[] vetor) {
        int[] arr = vetor;
        tempoInicial = System.currentTimeMillis();
        for (int i = arr.length - 1; i > 0; i--) {
            int changes = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Troca dos elementos
                    int x = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = x;
                    changes++;
                }
            }
            if (changes <= 0)
                break;
        }
        tempoFinal = System.currentTimeMillis();
        tempoTotal = tempoFinal - tempoInicial;
        System.out.println("BubbleSort ordenado em: " + tempoTotal + "ms");
    }

    ////////////////////////// INSERTIONSORT //////////////////////////

    public static void menuInsertion() {
        boolean execucao = true;
        while (execucao) {
            System.out.println();
            System.out.println("MENU INSERTIONSORT");
            System.out.println("Tamanho atual dos vetores: " + vetor.getTamanho());
            System.out.println("Escolha uma opção:");
            System.out.println("1. Ordenar vetor ordenado");
            System.out.println("2. Ordenar vetor invertido");
            System.out.println("3. Ordenar vetor aleatório");
            System.out.println("4. Sair para o Menu Principal");

            int opcao = teclado.nextInt();
            teclado.nextLine(); // Limpeza do buffer após nextInt()

            switch (opcao) {
                case 1:
                    insertionSort(vetor.getArrOrdenado());
                    break;
                case 2:
                    insertionSort(vetor.getArrInvertido());
                    break;
                case 3:
                    insertionSort(vetor.getArrAleatorio());
                    break;
                case 4:
                    execucao = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void insertionSort(int[] vetor) {
        int[] arr = vetor;
        tempoInicial = System.currentTimeMillis();

        for (int i = 1; i < arr.length; i++) {
            int index = i;
            while (index > 0 && arr[index] < arr[index - 1]) {
                // Troca dos elementos
                int x = arr[index - 1];
                arr[index - 1] = arr[index];
                arr[index] = x;
                index--;
            }
        }
        tempoFinal = System.currentTimeMillis();
        tempoTotal = tempoFinal - tempoInicial;
        System.out.println("InsertionSort ordenado em: " + tempoTotal + "ms");
    }

    ////////////////////////// SELECTIONSORT //////////////////////////

    public static void menuSelection() {
        boolean execucao = true;
        while (execucao) {
            System.out.println();
            System.out.println("MENU SELECTIONSORT");
            System.out.println("Tamanho atual dos vetores: " + vetor.getTamanho());
            System.out.println("Escolha uma opção:");
            System.out.println("1. Ordenar vetor ordenado");
            System.out.println("2. Ordenar vetor invertido");
            System.out.println("3. Ordenar vetor aleatório");
            System.out.println("4. Sair para o Menu Principal");

            int opcao = teclado.nextInt();
            teclado.nextLine(); // Limpeza do buffer após nextInt()

            switch (opcao) {
                case 1:
                    selectionSort(vetor.getArrOrdenado());
                    break;
                case 2:
                    selectionSort(vetor.getArrInvertido());
                    break;
                case 3:
                    selectionSort(vetor.getArrAleatorio());
                    break;
                case 4:
                    execucao = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void selectionSort(int[] vetor) {
        int[] arr = vetor;
        tempoInicial = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int x = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = x;
            }
        }
        tempoFinal = System.currentTimeMillis();
        tempoTotal = tempoFinal - tempoInicial;
        System.out.println("SelectionSort ordenado em: " + tempoTotal + "ms");
    }

    ////////////////////////// MERGESORT //////////////////////////

    public static void menuMerge() {
        boolean execucao = true;
        while (execucao) {
            System.out.println();
            System.out.println("MENU MERGESORT");
            System.out.println("Tamanho atual dos vetores: " + vetor.getTamanho());
            System.out.println("Escolha uma opção:");
            System.out.println("1. Ordenar vetor ordenado");
            System.out.println("2. Ordenar vetor invertido");
            System.out.println("3. Ordenar vetor aleatório");
            System.out.println("4. Sair para o Menu Principal");

            int opcao = teclado.nextInt();
            teclado.nextLine(); // Limpeza do buffer após nextInt()

            switch (opcao) {
                case 1:
                    mergeSort(vetor.getArrOrdenado());
                    break;
                case 2:
                    mergeSort(vetor.getArrInvertido());
                    break;
                case 3:
                    mergeSort(vetor.getArrAleatorio());
                    break;
                case 4:
                    execucao = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void mergeSort(int[] vetor) {
        int[] arr = vetor;
        tempoInicial = System.currentTimeMillis();

        // Chama a função recursiva de mergeSort
        mergeSortRecursive(arr);

        tempoFinal = System.currentTimeMillis();
        tempoTotal = tempoFinal - tempoInicial;
        System.out.println("MergeSort ordenado em: " + tempoTotal + "ms");
    }

    // Função recursiva para ordenar o vetor
    private static void mergeSortRecursive(int[] arr) {
        if (arr.length <= 1) {
            return; // Vetor com 0 ou 1 elemento já está ordenado
        }

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid); // Subvetor esquerdo
        int[] right = Arrays.copyOfRange(arr, mid, arr.length); // Subvetor direito

        mergeSortRecursive(left);
        mergeSortRecursive(right);
        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    ////////////////////////// TORNEIO //////////////////////////

    public static void torneio() {
        System.out.println();
        System.out.println("Iniciando o torneio de algoritmos...");

        int[] arrOrdenado = vetor.getArrOrdenado();
        System.out.println("Ordenando vetor ordenado:");
        compararAlgoritmos(arrOrdenado);

        int[] arrInvertido = vetor.getArrInvertido();
        System.out.println("Ordenando vetor invertido:");
        compararAlgoritmos(arrInvertido);

        int[] arrAleatorio = vetor.getArrAleatorio();
        System.out.println("Ordenando vetor aleatório:");
        compararAlgoritmos(arrAleatorio);
    }

    public static void compararAlgoritmos(int[] arr) {
        long tempoBubble = medirTempoBubble(arr.clone());
        long tempoInsertion = medirTempoInsertion(arr.clone());
        long tempoSelection = medirTempoSelection(arr.clone());
        long tempoMerge = medirTempoMerge(arr.clone());

        if (tempoBubble < tempoInsertion && tempoBubble < tempoSelection && tempoBubble < tempoMerge) {
            System.out.println("BubbleSort foi o mais rápido.");
        } else if (tempoInsertion < tempoBubble && tempoInsertion < tempoSelection && tempoInsertion < tempoMerge) {
            System.out.println("InsertionSort foi o mais rápido.");
        } else if (tempoSelection < tempoBubble && tempoSelection < tempoInsertion && tempoSelection < tempoMerge) {
            System.out.println("SelectionSort foi o mais rápido.");
        } else if (tempoMerge < tempoBubble && tempoMerge < tempoInsertion && tempoMerge < tempoSelection) {
            System.out.println("MergeSort foi o mais rápido.");
        } else {
            System.out.println("Empate entre dois ou mais algoritmos!");
        }
        System.out.println();
    }

    public static long medirTempoBubble(int[] arr) {
        tempoInicial = System.currentTimeMillis();
        bubbleSort(arr);
        tempoFinal = System.currentTimeMillis();
        return tempoFinal - tempoInicial;
    }

    public static long medirTempoInsertion(int[] arr) {
        tempoInicial = System.currentTimeMillis();
        insertionSort(arr);
        tempoFinal = System.currentTimeMillis();
        return tempoFinal - tempoInicial;
    }

    public static long medirTempoSelection(int[] arr) {
        tempoInicial = System.currentTimeMillis();
        selectionSort(arr);
        tempoFinal = System.currentTimeMillis();
        return tempoFinal - tempoInicial;
    }

    public static long medirTempoMerge(int[] arr) {
        tempoInicial = System.currentTimeMillis();
        mergeSort(arr);
        tempoFinal = System.currentTimeMillis();
        return tempoFinal - tempoInicial;
    }
}