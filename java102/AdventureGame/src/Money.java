
public class Money implements Reward{
	private String name;
	private int amount;
	
	public Money(int amount) {
		this.setAmount(amount);
		this.name = "Para";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		if(amount < 0) {
			this.amount = 0;
			return;
		}
		this.amount = amount;
	}

	@Override
	public void claim(Player player) {
		player.getCharacter().increaseMoney(this.amount);
	}
}
