
public class ToolStore extends NormalLocation{

	public ToolStore(Player player) {
		super(player, "Ma�aza");
	}

	@Override
	public boolean onLocation() {
		System.out.println("Ma�azaya ho�geldin!!");
		System.out.println("1 - Silahlar");
		System.out.println("2 - Z�rhlar");
		System.out.println("3 - ��k�� yap");
		System.out.print("Se�imin: ");
		int selection = Game.scan.nextInt();
		
		while(selection < 1 || selection > 3) {
			System.out.print("Ge�ersiz de�er tekrar giriniz: ");
			selection = Game.scan.nextInt();
		}
		
		switch(selection) {
			case 1:
				printWeapons();
				break;
			case 2:
				printArmors();
				break;
			default:
				return true;
		}
		
		return true;
	}

	private void printArmors() {
		System.out.println();
		this.getPlayer().printInfo();
		System.out.println();
		System.out.println("------ Z�rhlar ------");
		System.out.println("0 - Geri");
		for (Armor a : Armor.getArmors()) {
			a.printInfo();
		}
		
		System.out.print("Bir z�rh se�ebilirsin: ");
		int selectArmor = Game.scan.nextInt();
		
		if(selectArmor != 0) {
			System.out.println();
			while(selectArmor < 1 || selectArmor > Weapon.getWeapons().length) {
				System.out.print("Ge�ersiz de�er, l�tfen tekrar silah se�: ");
				selectArmor = Game.scan.nextInt();
			}
			
			Armor selectedArmor= Armor.getArmorById(selectArmor);
			if(selectedArmor != null) {
				this.getPlayer().buyArmor(selectedArmor);
			}
		}
	}

	private void printWeapons() {
		System.out.println();
		this.getPlayer().printInfo();
		System.out.println();
		System.out.println("------ Silahlar ------");
		System.out.println("0 - Geri");
		for (Weapon weapon : Weapon.getWeapons()) {
			weapon.printInfo();
		}
		
		System.out.print("Bir silah se�ebilirsin: ");
		int selectWeapon = Game.scan.nextInt();
		
		if(selectWeapon != 0) {
			System.out.println();
			while(selectWeapon < 1 || selectWeapon > Weapon.getWeapons().length) {
				System.out.print("Ge�ersiz de�er, l�tfen tekrar silah se�: ");
				selectWeapon = Game.scan.nextInt();
			}
			
			Weapon selectedWeapon = Weapon.getWeaponById(selectWeapon);
			if(selectedWeapon != null) {
				this.getPlayer().buyWeapon(selectedWeapon);
			}
		}
	}
}
