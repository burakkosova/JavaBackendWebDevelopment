import java.util.Random;

public class BattleLocation extends Location {
	private Enemy enemy;
	private String award;
	private int maxEnemy;

	public BattleLocation(Player player, String name, Enemy enemy, String award, int maxEnemy) {
		super(player, name);
		this.enemy = enemy;
		this.award = award;
		this.maxEnemy = maxEnemy;
	}

	@Override
	public boolean onLocation() {
		int enemyNumber = randomEnemyNumber();
		System.out.println("Þu an buradasýnýz: " + this.getName());
		System.out.println("Dikkatli ol! Burada " + enemyNumber + " tane " + this.enemy.getName() + " yaþýyor!!!");
		System.out.print("<S>avaþ veya <K>aç: ");
		Game.scan.nextLine();
		String selectCase = Game.scan.nextLine().toUpperCase();
		if (selectCase.equals("S")) {
			int result = combat(enemyNumber);
			if (result == 0)
				return false;
			else if (result == 1)
				return true;
			else {
				System.out.println("Tebrikler " + this.getName() + " temizlendi!!!");
				if (this.award != null) {
					System.out.println(this.award + " KAZANILDI!!!");
					this.getPlayer().getInventory().addAward(this.award);
				}

				System.out.println();
				System.out.print("Sahip olduðun ödüller: ");
				for (int i = 0; i < this.getPlayer().getInventory().getAwards().size(); i++) {
					System.out.print(this.getPlayer().getInventory().getAwards().get(i) + " ");
				}
				System.out.println();
			}
		}
		return true;
	}

	public int combat(int enemyNumber) {
		int rand;
		for (int i = 1; i <= enemyNumber; i++) {
			getPlayer().printInfo();
			while (this.getPlayer().getCharacter().getHealth() > 0 && this.getEnemy().getHealth() > 0) {
				System.out.println();
				System.out.print("<S>aldýr veya <K>aç: ");
				String selectCombat = Game.scan.nextLine().toUpperCase();
				if (selectCombat.equals("S")) {
					rand = (int) (Math.random() * 2) + 1;
					if (rand == 1) {
						this.getPlayer().attack(enemy);
						this.enemy.attack(this.getPlayer());
					} else {
						this.enemy.attack(this.getPlayer());
						this.getPlayer().attack(enemy);
					}
				} else {
					break;
				}
			}

			if (this.getPlayer().getCharacter().getHealth() <= 0) {
				System.out.println();
				System.out.println("WASTED!!!");
				return 0;
			} else if (this.getEnemy().getHealth() <= 0) {
				System.out.println("Tebrikler " + this.getEnemy().getName() + " öldü!!!");
				if (this.enemy.getReward() != null) {
					if (this.enemy.getName().equals("Yýlan")) {
						System.out.println("Bu yýlandan " + this.enemy.getReward().getName() + " düþtü!!!");
					}
					this.enemy.getReward().claim(this.getPlayer());
				} else {
					System.out.println("Bu yýlandan hiç ödül düþmedi :(");
				}

				if (i != enemyNumber) {
					System.out.println(i + 1 + ". " + this.getEnemy().getName() + " geliyor.");
				}
				this.setEnemy(this.getEnemy().reNew());
			} else {
				return 1;
			}

			System.out.println();
		}
		return 2;
	}

	public int randomEnemyNumber() {
		Random rand = new Random();
		return rand.nextInt(this.maxEnemy) + 1;
	}

	public Enemy getEnemy() {
		return enemy;
	}

	public void setEnemy(Enemy enemy) {
		this.enemy = enemy;
	}

	public String getAward() {
		return award;
	}

	public void setAward(String award) {
		this.award = award;
	}

}
