
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
					+ "\t Saðlýk: " + type.getHealth() + "\t Para: " + type.getMoney());
		}
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.print("Lütfen bir karakter gir: ");
		int choice = Game.scan.nextInt();
		if(choice > 0 && choice < (types.length + 1)) {
			this.character = types[choice-1];
		}else {
			this.character = types[0];
		}
		System.out.println("Artýk bir "+this.character.getName()+" olarak yoluna devam edebilirsin.");
	}

	public void printInfo() {
		System.out.print("Silah: "+ this.inventory.getWeapon().getName()
				+ ", Zýrh: " + this.inventory.getArmor().getName()
				+", Hasar: "+this.getDamage()
				+", Saðlýk: "+this.character.getHealth()
				+", Para: "+this.character.getMoney());
		
		if(this.inventory.getArmor().getBlock() > 0)
			System.out.println(", Koruma: "+this.inventory.getArmor().getBlock());
		else
			System.out.println();
	}
	
	private int getDamage() {
		return this.character.getDamage() + this.inventory.getWeapon().getDamage();
	}
	
	public void buyWeapon(Weapon weapon) {
		if(weapon.getPrice() <= this.character.getMoney()) {
			this.character.buyItem(weapon.getPrice());
			System.out.println(weapon.getName()+" satýn aldýnýz.");
			this.inventory.setWeapon(weapon);
			this.printInfo();
		}
		else {
			System.out.println("Yeterli paranýz bulunmamaktadýr!");
		}
	}

	public void buyArmor(Armor armor) {
		if(armor.getPrice() <= this.character.getMoney()) {
			this.character.buyItem(armor.getPrice());
			System.out.println(armor.getName()+" satýn aldýnýz.");
			this.inventory.setArmor(armor);
			this.printInfo();
		}
		else {
			System.out.println("Yeterli paranýz bulunmamaktadýr!");
		}
	}

	public void attack(Enemy enemy) {
		if(this.getCharacter().getHealth() > 0) {
			System.out.println(this.character.getName() +" "+ this.name +" "+ this.inventory.getWeapon().getName()+" ile saldýrýyor..." );
			enemy.setHealth(enemy.getHealth() - this.getDamage());
			enemy.printInfo();
			System.out.println();
		}
	}
}

