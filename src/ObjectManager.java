import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	int x;
	int y;
	int width;
	int height;
	//commedf
	int score = 0;
	long enemyTimer = System.currentTimeMillis();
	int enemySpawnTime = 1000;
	ArrayList<Monster> monster = new ArrayList<Monster>();
	ArrayList<Bullet> bullet = new ArrayList<Bullet>();
	Teammate teammate;
	Human human;
	Armour armour;
	Armour2 armour2;


	void addBullet(Bullet b) {
		bullet.add(b);
	}

	void addEnemy(Monster m) {
		monster.add(m);
	}
	
void purgeObjects() {
		for (int i = 0; i < monster.size(); i++) {
			if (monster.get(i).isAlive == false) {
				monster.remove(i);
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
		for (Monster m: monster) {
			m.draw(g);
		}
	}
	public void ManageMonsters() {
		if(System.currentTimeMillis() - enemyTimer >= enemySpawnTime) {
			addMonster(new Monster(new Random().nextInt(ThirdScreen.width),0,50,50,true));
			enemyTimer=System.currentTimeMillis();
		}
	}

	void update() {
		teammate.update();
		human.update();
		for (Bullet b : bullet) {
			b.update();
		}
		for (Monster m: monster) {
			m.update();
		}
	}

	void checkCollision() {
		for (Monster m: monster) {
			if(human.collisionbox.intersects(m.collisionbox)){
				human.isAlive= false;
			} 
			else if(teammate.collisionbox.intersects(m.collisionbox)){
				teammate.isAlive= false;
			}
		for (Bullet b : bullet) {
			if (b.collisionbox.intersects(m.collisionbox)) {
				System.out.println("hit");
				m.isAlive= false;
			}
		}
		}
	}

	public void reset() {
		
	}


	public int getScore1() {
		return score;
	}

	public void manageMonsters() {
		if(System.currentTimeMillis()- enemyTimer >= enemySpawnTime) {
			addMonster(new Monster(new Random().nextInt(FirstScreen.WIDTH),0,50,50,true));
			enemyTimer= System.currentTimeMillis();
		}
	}

	void addMonster(Monster monster) {
		
		
	}


}
