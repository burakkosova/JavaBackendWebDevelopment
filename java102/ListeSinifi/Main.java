package liste;

public class Main {

	public static void main(String[] args) {
		 MyList<Integer> liste = new MyList<>();
	        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boþ" : "Dolu"));
	        liste.add(10);
	        liste.add(20);
	        liste.add(30);
	        liste.add(40);
	        liste.add(20);
	        liste.add(50);
	        liste.add(60);
	        liste.add(70);

	        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boþ" : "Dolu"));

	        // Bulduðu ilk indeksi verir
	        System.out.println("Indeks : " + liste.indexOf(20));

	        // Bulamazsa -1 döndürür
	        System.out.println("Indeks :" + liste.indexOf(100));

	        // Bulduðu son indeksi verir
	        System.out.println("Indeks : " + liste.lastIndexOf(20));

	        // Listeyi Object[] dizisi olarak geri verir.
	        Object[] dizi = liste.toArray();
	        System.out.println("Object dizisinin ilk elemaný : " + dizi[0]);

	        // Liste veri türünde alt bir liste oluþturdu
	        MyList<Integer> altListem = liste.subList(0, 3);
	        System.out.println(altListem.toString());

	        // Deðerim listedeki olup olmadýðýný sorguladý
	        System.out.println("Listemde 20 deðeri : " + liste.contains(20));
	        System.out.println("Listemde 120 deðeri : " + liste.contains(120));

	        // Listeyi tamamen boþaltýr ve varsayýlan boyutuna çevirir
	        liste.clear();
	        System.out.println(liste.toString());
	        
//	        MyList<Integer> l = liste.subList(2, 5);
//	        System.out.println(l.toString());
//	        System.out.println(liste.size());
//	        System.out.println(liste.getCapacity());
//	        System.out.println(liste.contains(null));
	}

}
