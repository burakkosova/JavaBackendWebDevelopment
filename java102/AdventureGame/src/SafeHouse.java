
public class SafeHouse extends NormalLocation{

	public SafeHouse(Player player) {
		super(player, "Güvenli ev");
	}

	@Override
	public boolean onLocation() {
		if(this.getPlayer().getInventory().getAwards().size() == 3) {
			System.out.println("CONGRATULATIONS!!! "+this.getPlayer().getName()+" 3 bölgeyi de temizleyerek oyunu kazandýnnn!");
			System.exit(0);
		}
			
		System.out.println("Güvenli evdesin burasý senin için güvenli bir yer, düþman yok!");
		this.getPlayer().getCharacter().fillHealth();
		System.out.println("Canýn yenilendi !");
		System.out.println("Can seviyesi : " + this.getPlayer().getCharacter().getHealth());
		return true;
	}
}
