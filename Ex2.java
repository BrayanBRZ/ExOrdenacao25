import java.util.Arrays;

public class Ex2 {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 9, 2, 5, 8, 2, 1, 7 };
		int n = arr.length;
		System.out.println("Selection Sort:");

		for (int i = 0; i < n - 1; i++) {
			int minIdx = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] > arr[minIdx]) { //Comparacao alterada para ordenar de forma decrescente
					minIdx = j;
				}
			}
			if (minIdx != i) {
				int temp = arr[i];
				arr[i] = arr[minIdx];
				arr[minIdx] = temp;
				System.out.println(Arrays.toString(arr));
			}
		}
	}
}
