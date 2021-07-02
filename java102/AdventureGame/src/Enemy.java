
public abstract class Enemy {
	private int id;
	private String name;
	private int damage;
	private int health;
	private Reward reward;
	
	public Enemy(int id, String name, int damage, int health, Reward reward) {
		this.id = id;
		this.name = name;
		this.damage = damage;
		this.health = health;
		this.reward = reward;
	}
	public int getId() {
		return id;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		if (health < 0) {
			this.health = 0;
			return;
		}
		
		this.health = health;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Reward getReward() {
		return reward;
	}
	
	public void setReward(Reward reward) {
		this.reward = reward;
	}
	
	public void printInfo() {
		System.out.println(this.name + " Saðlýk: " + this.health);
	}
	public void attack(Player player) {
		if(this.health > 0) {
			System.out.println(this.name + " saldýrýyor..." );
			if(this.damage - player.getInventory().getArmor().getBlock() > 0)
				player.getCharacter().decreaseHealth(this.damage - player.getInventory().getArmor().getBlock());
			else
				System.out.println(player.getInventory().getArmor().getName() + " hasardan korudu!");
			
			System.out.println(player.getCharacter().getName() +" "+ player.getName() + " Kalan Saðlýk: " + player.getCharacter().getHealth());
			System.out.println();
		}
	}
	public abstract Enemy reNew();
}
