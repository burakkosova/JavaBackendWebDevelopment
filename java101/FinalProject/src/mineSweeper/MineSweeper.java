package mineSweeper;

public class MineSweeper {
	private char[][] map;
	private char[][] ui;
	private int openedCellCount;
	private int cleanCellCount;
	
	public MineSweeper(int row, int column) {
		map = new char[row][column];
		ui = new char[row][column];
		fillUI();
		printUI();
		calculateMap();
		openedCellCount = 0;
	}
	
	private void fillUI() {
		for(int i=0; i<ui.length; i++) {
			for (int j = 0; j < ui[0].length; j++) {
				ui[i][j] = '-';
			}
		}
	}
	
	private void printUI() {
		for(int i=0; i<ui.length; i++) {
			for (int j = 0; j < ui[0].length; j++) {
				System.out.print(ui[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	private void calculateMap() {
		int bombCount = (map.length * map[0].length) / 4;
		cleanCellCount = (map.length * map[0].length) - bombCount;
		
		for (int i = 0; i < bombCount; i++) {
			placeBomb();
		}
		
		for(int i=0; i<map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				if(map[i][j] == '*')
					continue;
				calcCell(i, j);
			}
		}
	}
	
	private void placeBomb() {
		int row = (int) (Math.random() * map.length); 
		int column = (int) (Math.random() * map[0].length); 
		if(map[row][column] == '*') {
			placeBomb();
			return;
		}
		
		map[row][column] = '*';
	}
	
	private void calcCell(int row, int column) {
		int value = 0;
		for(int i=row-1; i<=row+1; i++) {
			if (i < 0 || i >= map.length) 
				continue;
			
			for(int j=column-1; j<=column+1; j++) {
				if(j < 0 || j >= map[0].length)
					continue;
				
				if(map[i][j] == '*')
					value++;
			}
		}
		map[row][column] = Character.forDigit(value, 10);
	}
	
	public boolean openCell(int row, int column) {
		try {
			ui[row][column] = map[row][column];
			printUI();
			System.out.println("===================================");
			
			if(map[row][column] == '*') {
				System.err.println("Game Over!!!");
				return false;
			}
			
			openedCellCount++;
			if (openedCellCount == cleanCellCount) {
				System.out.println("Tebrikler Oyunu Kazandýnýz !");
				return false;
			}
			return true;
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Lütfen sýnýrlar içinde bir deðer giriniz!");
			return true;
		}
	}
	
	public void printMap() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("===================================");
	}
}

