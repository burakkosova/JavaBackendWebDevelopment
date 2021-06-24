package mineSweeper;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Mayýn Tarlasý Oyununa Hoþgeldiniz !");
		System.out.println("Ne kadar büyük bir haritada oynamak istiyorsunuz?");
		
		System.out.print("Satýr sayýsý giriniz : ");
		int row = scan.nextInt();
		System.out.print("Sütun sayýsý giriniz : ");
		int column = scan.nextInt();
		System.out.println("===================================");
		
		
		MineSweeper ms = new MineSweeper(row,column);
//		ms.printMap();
		
		while(true) {
			System.out.print("Satýr giriniz : ");
			row = scan.nextInt();
			System.out.print("Sütun giriniz : ");
			column = scan.nextInt();
			if(!ms.openCell(row, column))
				break;
		}
		
		scan.close();
	}

}
