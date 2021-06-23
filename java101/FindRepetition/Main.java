import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] numbers = { 10, 20, 20, 10, 0, 0, 10, 20, 5, 20 };

		System.out.println("Dizi : " + Arrays.toString(numbers));
		repetition(numbers);
	}

	static void repetition(int[] array) {
		Integer[] numbers = new Integer[array.length];
		for (int i = 0; i < array.length; i++)
			numbers[i] = array[i];

		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] == null)
				continue;

			int count = 1;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					count++;
					numbers[j] = null;
				}
			}
			System.out.println(numbers[i] + " sayýsý " + count + " kere tekrar edildi.");
		}
	}
}
