package game;


public class Player extends Unit {

	private int xp;
	private int centerX = 400;
	private int centerY = 240;

	public Player(DungeonRoom location, String name, int level) {
		super(location, name, level, 5);
	}

	public void gainXP(int gainedXP) {
		this.xp += gainedXP;
		if (this.xp >= 100) {
			this.xp -= 100;
			this.gainLevel();
		}
	}

	public void move(DungeonRoom location) {
		if (location == null) return;
		super.setLocation(location);
		System.out.println(Integer.toString(location.getExits()));
		location.setExplored(true);
	}

	protected void gainLevel() {
		super.gainLevel();
	}

	@Override
	public int getTotalAttack() {
		return super.getTotalAttack() + 5;
	}
	
	public int getCenterX() {
		return centerX;
	}

	public int getCenterY() {
		return centerY;
	}

}
