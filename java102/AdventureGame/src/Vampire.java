
public class Vampire extends Enemy{

	public Vampire() {
		super(2, "Vampir", 4, 14, new Money(7));
	}

	@Override
	public Enemy reNew() {
		return new Vampire();
	}

}
