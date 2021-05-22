package kodluyoruz.BoxMatch;

public class Main {

	public static void main(String[] args) {
		Fighter marc = new Fighter("Marc", 15, 100, 90, 10);
		Fighter alex = new Fighter("Alex", 10, 95, 100, 30);
		Ring r = new Ring(marc, alex, 90, 100);
		r.run();
	}

}
