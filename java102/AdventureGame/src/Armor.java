
public class Armor implements Reward{
	private int id;
	private String name;
	private int block;
	private int price;
	
	public Armor(int id, String name, int block, int price) {
		this.name = name;
		this.id = id;
		this.block = block;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBlock() {
		return block;
	}

	public void setBlock(int block) {
		this.block = block;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public static Armor[] getArmors() {
		Armor[] armors = new Armor[3];
		armors[0] = new Armor(1,"Hafif Zýrh",1,15);
		armors[1] = new Armor(2,"Orta Zýrh",3,25);
		armors[2] = new Armor(3,"Aðýr Zýrh",5,40);
		return armors;
	}
	
	public void printInfo() {
		System.out.println(this.getId() + " - " + this.getName() + " <Fiyat : " + this.getPrice() + ", Koruma : " + this.getBlock() + ">");
	}

	public static Armor getArmorById(int selectArmor) {
		for (Armor a : Armor.getArmors()) {
			if(selectArmor == a.getId())
				return a;
		}
		return null;
	}

	public Armor getRandomArmor() {
		int rand = (int)( Math.random()*10)+1;
		
		if(rand == 1 || rand == 2)
			return Armor.getArmors()[2];
		else if(rand >= 3 && rand <= 5)
			return Armor.getArmors()[1];
		else 
			return Armor.getArmors()[0];
	}
	
	@Override
	public void claim(Player player) {
		player.getInventory().setArmor(getRandomArmor());
	}
}
