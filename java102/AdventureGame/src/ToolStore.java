
public class ToolStore extends NormalLocation{

	public ToolStore(Player player) {
		super(player, "Maðaza");
	}

	@Override
	public boolean onLocation() {
		System.out.println("Maðazaya hoþgeldin!!");
		System.out.println("1 - Silahlar");
		System.out.println("2 - Zýrhlar");
		System.out.println("3 - Çýkýþ yap");
		System.out.print("Seçimin: ");
		int selection = Game.scan.nextInt();
		
		while(selection < 1 || selection > 3) {
			System.out.print("Geçersiz deðer tekrar giriniz: ");
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
		System.out.println("------ Zýrhlar ------");
		System.out.println("0 - Geri");
		for (Armor a : Armor.getArmors()) {
			a.printInfo();
		}
		
		System.out.print("Bir zýrh seçebilirsin: ");
		int selectArmor = Game.scan.nextInt();
		
		if(selectArmor != 0) {
			System.out.println();
			while(selectArmor < 1 || selectArmor > Weapon.getWeapons().length) {
				System.out.print("Geçersiz deðer, lütfen tekrar silah seç: ");
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
		
		System.out.print("Bir silah seçebilirsin: ");
		int selectWeapon = Game.scan.nextInt();
		
		if(selectWeapon != 0) {
			System.out.println();
			while(selectWeapon < 1 || selectWeapon > Weapon.getWeapons().length) {
				System.out.print("Geçersiz deðer, lütfen tekrar silah seç: ");
				selectWeapon = Game.scan.nextInt();
			}
			
			Weapon selectedWeapon = Weapon.getWeaponById(selectWeapon);
			if(selectedWeapon != null) {
				this.getPlayer().buyWeapon(selectedWeapon);
			}
		}
	}
}
