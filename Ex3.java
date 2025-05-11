package Ex3;

import java.util.Arrays;

public class Ex3 {

    public static void main(String[] args) {

        String[] arr = {"bbb", "aaa", "ccc"};
        System.out.println("Insertion Sort:");
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {

            int index = i;
            while (index > 0 && arr[index].compareTo(arr[index - 1]) < 0) {

                String temp = arr[index - 1];
                arr[index - 1] = arr[index];
                arr[index] = temp;
                index--;

                System.out.println(Arrays.toString(arr));
            }
        }
    }
}
