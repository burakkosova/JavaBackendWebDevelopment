
public class Archer extends PlayerType {
	
	public Archer() {
		super(2,"Okçu",7,18,100);
	}

	@Override
	public void fillHealth() {
		this.setHealth(18);
	}
	
	
}
