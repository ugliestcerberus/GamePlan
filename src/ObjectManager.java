import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	int x;
	int y;
	int width;
	int height;
	int score = 0;
	long enemyTimer = System.currentTimeMillis();
	int enemySpawnTime = 1000;
	ArrayList<Enemies> enemies = new ArrayList<Enemies>();
	ArrayList<Bullet> bullet = new ArrayList<Bullet>();
	Teammate teammate;
	Human human;
	Armour armour;
	Armour2 armour2;


	

	void addBullet(Bullet b) {
		bullet.add(b);
	}

	void addEnemy(Enemies e) {
		enemies.add(e);
	}
	
void purgeObjects() {
		for (int i = 0; i < enemies.size(); i++) {
			if (enemies.get(i).isAlive == false) {
				enemies.remove(i);
			}
		}
		for (int i = 0; i < bullet.size(); i++) {
			if (bullet.get(i).isAlive == false) {
				bullet.remove(i);
			}
		}
	}

	ObjectManager(Teammate teammate) {
		this.teammate = teammate;
	}

	ObjectManager(Human human) {
		this.human = human;
	}
	void setTeammate(Teammate teammate) {
		this.teammate = teammate;
	}

	void draw(Graphics g) {
		teammate.draw(g);
		human.draw(g);
		for (Bullet b : bullet) {
			b.draw(g);
		}
		for (Enemies e : enemies) {
			e.draw(g);
		}
	}
	public void ManageEnemies() {
		if(System.currentTimeMillis() - enemyTimer >= enemySpawnTime) {
			addEnemy(new Enemies(new Random().nextInt(ThirdScreen.width),0,50,50,true));
			enemyTimer=System.currentTimeMillis();
		}
	}

	void update() {
		teammate.update();
		human.update();
		for (Bullet b : bullet) {
			b.update();
		}
		for (Enemies e : enemies) {
			e.update();
		}
	}

	void checkCollision() {
		for (Enemies e : enemies) {
			System.out.println("ja");
//			if (armour.collisionbox.intersects(e.collisionbox)) {
//				armour.isAlive = false;
//			} else if (armour2.collisionbox.intersects(e.collisionbox)) {
//				armour2.isAlive = false;
		//	} 
		if(human.collisionbox.intersects(e.collisionbox)){
				human.isAlive= false;
			} 
			else if(teammate.collisionbox.intersects(e.collisionbox)){
				teammate.isAlive= false;
			}
		for (Bullet b : bullet) {
			if (b.collisionbox.intersects(e.collisionbox)) {
				System.out.println("hit");
				e.isAlive= false;
			}
		}
		}
	}

	public void reset() {
		
	}


	public int getScore1() {
		return score;
	}

	public void manageEnemies() {
		if(System.currentTimeMillis()- enemyTimer >= enemySpawnTime) {
			addEnemy(new Enemies(new Random().nextInt(FirstScreen.WIDTH),0,50,50,true));
			enemyTimer= System.currentTimeMillis();
		}
		
	}


}
