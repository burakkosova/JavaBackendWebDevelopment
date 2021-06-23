import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number;
		int[] numbers = {15,12,788,1,-1,-778,2,0};
		Scanner input = new Scanner(System.in);
		
		System.out.print("Bir sayı giriniz : ");
		number = input.nextInt();
		input.close();
		
		System.out.println("Dizi : " + printArray(numbers));
		System.out.println("Girilen sayı : " + number);
		System.out.println("Girilen sayıdan küçük en yakın sayı : " + ClosestSmaller(number, numbers));
		System.out.println("Girilen sayıdan büyük en yakın sayı : " + ClosestGreater(number, numbers));
	}
	
	public static String printArray(int[] array) {
		String result = "{";
		for (int i : array) {
			result += Integer.toString(i);
			if (i != array[array.length-1]) 
				result += ",";
		}
		result += "}";
		return result;
	}
	
	public static int ClosestSmaller(int number, int[] numbers) {
		int difference=Integer.MAX_VALUE;
		int result = numbers[0];
		for (int i : numbers) {
			if (Math.abs(i - number) < difference && i < number) {
				result = i;
				difference = Math.abs(i - number);
			}
		}
		return result;
	}
	
	public static int ClosestGreater(int number, int[] numbers) {
		int difference=Integer.MAX_VALUE;
		int result = numbers[0];
		for (int i : numbers) {
			if (Math.abs(i - number) < difference && i > number) {
				result = i;
				difference = Math.abs(i - number);
			}
		}
		return result;
	}
}
