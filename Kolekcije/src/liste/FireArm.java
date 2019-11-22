package liste;

public class FireArm implements Weapon {
	
	private String name;
	private final int damage = 50;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDamage() {
		return damage;
	}

	@Override
	public void hit(Soldier soldier) {
		int preostaliHealth = soldier.getHealth() - this.damage;
		soldier.setHealth(preostaliHealth);
		System.out.println(soldier.getName() + " sada ima " + preostaliHealth);
	}

}
