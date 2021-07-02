
public class Player {
	private PlayerType character;
	private Inventory inventory;
	private String name;

	public Player(String name) {
		this.inventory = new Inventory();
		this.name = name;
	}

	public PlayerType getCharacter() {
		return character;
	}

	public void setCharacter(PlayerType character) {
		this.character = character;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void selectCharacter() {
		PlayerType[] types = { new Samurai(), new Archer(), new Knight() };

		System.out.println("---------------------------------------------------------------------------------------");
		for (PlayerType type : types) {
			System.out.println(type.getId() + ". Karakter: " + type.getName() + "\t Hasar: " + type.getDamage()
					+ "\t Sa�l�k: " + type.getHealth() + "\t Para: " + type.getMoney());
		}
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.print("L�tfen bir karakter gir: ");
		int choice = Game.scan.nextInt();
		if(choice > 0 && choice < (types.length + 1)) {
			this.character = types[choice-1];
		}else {
			this.character = types[0];
		}
		System.out.println("Art�k bir "+this.character.getName()+" olarak yoluna devam edebilirsin.");
	}

	public void printInfo() {
		System.out.print("Silah: "+ this.inventory.getWeapon().getName()
				+ ", Z�rh: " + this.inventory.getArmor().getName()+" ");
		this.character.getInfo();
	}
	
	public void buyWeapon(Weapon weapon) {
		if(this.inventory.getWeapon().getId() != 0) {
			this.character.decreaseDamage(this.inventory.getWeapon().getDamage());
			this.inventory.dropWeapon();
			System.out.println();
		}
		
		if(weapon.getPrice() <= this.character.getMoney()) {
			this.character.increaseDamage(weapon.getDamage());
			this.character.buyItem(weapon.getPrice());
			System.out.println(weapon.getName()+" sat�n ald�n�z.");
			this.inventory.setWeapon(weapon);
			this.printInfo();
		}
		else {
			System.out.println("Yeterli paran�z bulunmamaktad�r!");
		}
	}

	public void buyArmor(Armor armor) {
		if(this.inventory.getArmor().getId() != 0) {
			this.character.decreaseHealth(this.inventory.getArmor().getBlock());
			this.inventory.dropArmor();
			System.out.println();
		}
		
		if(armor.getPrice() <= this.character.getMoney()) {
			this.character.increaseHealth(armor.getBlock());
			this.character.buyItem(armor.getPrice());
			System.out.println(armor.getName()+" sat�n ald�n�z.");
			this.inventory.setArmor(armor);
			this.printInfo();
		}
		else {
			System.out.println("Yeterli paran�z bulunmamaktad�r!");
		}
	}

	
	public void attack(Enemy enemy) {
		System.out.println(this.character.getName() +" "+ this.name +" "+ this.inventory.getWeapon().getName()+" ile sald�r�yor..." );
		enemy.setHealth(enemy.getHealth() - this.character.getDamage());
		enemy.printInfo();
	}
}

