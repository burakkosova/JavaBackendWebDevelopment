
public class SafeHouse extends NormalLocation{

	public SafeHouse(Player player) {
		super(player, "G�venli ev");
	}

	@Override
	public boolean onLocation() {
		if(this.getPlayer().getInventory().getAwards().size() == 3) {
			System.out.println("CONGRATULATIONS!!! "+this.getPlayer().getName()+" 3 b�lgeyi de temizleyerek oyunu kazand�nnn!");
			System.exit(0);
		}
			
		System.out.println("G�venli evdesin buras� senin i�in g�venli bir yer, d��man yok!");
		this.getPlayer().getCharacter().fillHealth();
		System.out.println("Can�n yenilendi !");
		System.out.println("Can seviyesi : " + this.getPlayer().getCharacter().getHealth());
		return true;
	}
}
