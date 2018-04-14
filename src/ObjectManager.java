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
			if (armour.collisionbox.intersects(e.collisionbox)) {
				Armour.isAlive = false;
			} else if (armour2.collisionbox.intersects(e.collisionbox)) {
				Armour2.isAlive = false;
			} else if(human.collisionbox.intersects(e.collisionbox)){
				human.isAlive= false;
			} 
			else if(teammate.collisionbox.intersects(e.collisionbox)){
				teammate.isAlive= false;
			}
		}
		for (Bullet b : bullet) {
			//if (enemies.collisionbox.intersects(b.collisionbox)) {

			//}
		}
	}

	public void reset() {
		
	}
}
