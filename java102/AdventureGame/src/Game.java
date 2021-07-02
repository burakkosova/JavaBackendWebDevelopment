import java.util.Scanner;

public class Game {
	public Player player;
	public Location location;
	public static Scanner scan = new Scanner(System.in);
//	public static List<String> cleanRegions;
	
//	public Game() {
//		Game.cleanRegions = new ArrayList<String>();
//	}
	
	public void start() {
		System.out.println("Macera Oyununa Ho�geldiniz!");
		System.out.print("L�tfen bir isim gir : ");
		this.player = new Player(scan.nextLine());
		System.out.println("Merhaba " + this.player.getName() + ", bu karanl�k ve sisli adaya ho�geldin. Burada ya�ananlar�n hepsi ger�ek!");
		
		System.out.println("Bu maceradaki rol�n nedir?");
		player.selectCharacter();
		System.out.println();
		
		while(true) {
			Location location = null;
			System.out.println("B�lgeler");
			System.out.println("0 - Oyunu Sonland�r");
			System.out.println("1 - G�venli Ev");
			System.out.println("2 - E�ya D�kkan�");
			System.out.println("3 - Ma�ara");
			System.out.println("4 - Orman");
			System.out.println("5 - Nehir");
			System.out.println("6 - Maden");
			System.out.print("L�tfen gitmek istedi�in b�lgeyi se�: ");
			int selectionLoc = Game.scan.nextInt();
			switch(selectionLoc) {
				case 0:
					break;
				case 1:
					location = new SafeHouse(player);
					break;
				case 2:
					location = new ToolStore(player);
					break;
				case 3:
					if(this.player.getInventory().getAwards().contains("Yemek")) {
						System.out.println();
						System.out.println("Ma�ara b�lgesi temizlendi giri� yapamazs�n�z!");
						System.out.println();
						continue;
					}else {
						location = new Cave(player);
						break;
					}
				case 4:
					if(this.player.getInventory().getAwards().contains("Odun")) {
						System.out.println();
						System.out.println("Orman b�lgesi temizlendi giri� yapamazs�n�z!");
						System.out.println();
						continue;
					}else {
						location = new Forest(player);
						break;
					}
				case 5:
					if(this.player.getInventory().getAwards().contains("Su")) {
						System.out.println();
						System.out.println("Nehir b�lgesi temizlendi giri� yapamazs�n�z!");
						System.out.println();
						continue;
					}else {
						location = new River(player);
						break;
					}
				case 6:
					location = new Mine(player);
					break;
				default:
					location = new SafeHouse(player);
			}
			
			if(location == null) {
				System.out.println();
				System.out.println("�abuk pes ettin!!!");
				break;
			}
			
			System.out.println();
			if (!location.onLocation()) {
				System.out.println("GAME OVER !!!");
				break;
			}
			System.out.println();
		}
	}
}
