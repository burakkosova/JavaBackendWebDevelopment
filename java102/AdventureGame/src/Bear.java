
public class Bear extends Enemy{

	public Bear() {
		super(3, "Ay�", 7, 20, new Money(12));
	}

	@Override
	public Enemy reNew() {
		return new Bear();
	}
}
