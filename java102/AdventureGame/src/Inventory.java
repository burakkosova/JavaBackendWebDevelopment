import java.util.ArrayList;
import java.util.List;

public class Inventory {
	private Weapon weapon;
	private Armor armor;
	private List<String> awards;

	public Inventory() {
		this.weapon = new Weapon(0, "Yumruk", 0, 0);
		this.armor = new Armor(0, "Pa�avra", 0, 0);
		this.awards = new ArrayList<String>();
	}

	public void addAward(String award) {
		this.awards.add(award);
	}
	
	public List<String> getAwards() {
		return this.awards;
	}
	
	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		System.out.println(this.weapon.getName() + " b�rak�ld�.");
		System.out.println(weapon.getName() + " ku�an�ld�.");
		int newDamage = weapon.getDamage() - this.weapon.getDamage();
		if(newDamage > 0)
			System.out.println("Hasar --> +" + newDamage);
		else if(newDamage < 0)
			System.out.println("Hasar --> " + newDamage);
		
		this.weapon = weapon;
	}

	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		System.out.println(this.armor.getName() + " b�rak�ld�.");
		System.out.println(armor.getName() + " ku�an�ld�.");
		int newBlock = armor.getBlock() - this.armor.getBlock();
		if(newBlock > 0)
			System.out.println("Koruma --> +" + newBlock);
		else if(newBlock < 0)
			System.out.println("Koruma --> " + newBlock);
		
		this.armor = armor;
	}
}
