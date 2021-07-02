
public class Zombie extends Enemy{

	public Zombie() {
		super(1, "Zombi", 3, 10,4);
	}

	@Override
	public void reNew() {
		this.setHealth(10);
	}

}
