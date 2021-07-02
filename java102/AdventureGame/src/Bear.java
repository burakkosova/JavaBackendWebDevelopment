
public class Bear extends Enemy{

	public Bear() {
		super(3, "Ayı", 7, 20,12);
	}

	@Override
	public void reNew() {
		this.setHealth(20);
	}
}
