
public class Samurai extends PlayerType{
	
	public Samurai() {
		super(1,"Samuray",5,21,15);
	}

	@Override
	public void fillHealth() {
		this.setHealth(21);
	}
}
