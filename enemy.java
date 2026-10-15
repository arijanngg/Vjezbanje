package vjezbe;

public class enemy {

	private int x;
	private int  y;
	private int width;
	private int height;
	private int damage;
	
	public enemy(int x, int y, int width, int height, int damage) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.damage = damage;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		
		if(damage>0 && damage<100) {
		this.damage = damage;
		}else {
			System.out.println("Nije moguce " );
		this.damage = 0;
		}
	}

	

}
