import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Dizinin boyutu n : ");
    	int dim = input.nextInt();
    	int[] numbers = new int[dim];
    	System.out.println("Dizinin elemanlarýný giriniz :");
    	
    	for (int i = 0; i < dim; i++) {
			System.out.print(i+1 + ". Elemaný : ");
			numbers[i] = input.nextInt();
		}
    	input.close();
    	
    	sort(numbers);
    	System.out.print("Sýralama : ");
    	for (int i : numbers) {
			System.out.print(i + " ");
		}
    }
    
    static void sort(int[] numbers) {
    	while (true) {
    		boolean flag = true;
    		for (int i = 0; i < numbers.length-1; i++) {
    			if(numbers[i] > numbers[i+1]) {
    				int temp = numbers[i];
    				numbers[i] = numbers[i+1];
    				numbers[i+1] = temp;
    				flag = false;
    			}
    		}
    		if(flag)
    			break;
		}
    }
    
}