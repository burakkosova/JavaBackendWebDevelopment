import java.util.ArrayList;
import java.util.List;

public class Inventory {
	private Weapon weapon;
	private Armor armor;
	private List<String> awards;

	public Inventory() {
		this.weapon = new Weapon(0, "Yumruk", 0, 0);
		this.armor = new Armor(0, "Paçavra", 0, 0);
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
		this.weapon = weapon;
	}

	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}

	public void dropWeapon() {
		System.out.println(this.weapon.getName() + " býrakýldý.");
		this.weapon = new Weapon(0, "Yumruk", 0, 0);
	}

	public void dropArmor() {
		System.out.println(this.armor.getName() + " býrakýldý.");
		this.armor = new Armor(0, "Paçavra", 0, 0);
	}
}
