
public class Vampire extends Enemy{

	public Vampire() {
		super(2, "Vampir", 4, 14,7);
	}

	@Override
	public void reNew() {
		this.setHealth(14);
	}

}
