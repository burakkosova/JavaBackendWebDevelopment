
public class Main {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6};
		System.out.println(CalcHarmonicMean(numbers));
	}
	
	public static double CalcHarmonicMean(int[] numbers) {
		double sum = 0;
		for (int i : numbers) {
			sum += 1/(double)i;
		}
		return numbers.length/sum;
	}
}
