
public class Zombie extends Enemy{

	public Zombie() {
		super(1, "Zombi", 3, 10, new Money(4));
	}

	@Override
	public Enemy reNew() {
		return new Zombie();
	}

}
