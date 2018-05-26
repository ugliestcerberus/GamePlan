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
	ArrayList<Monster> monster = new ArrayList<Monster>();
	ArrayList<Bullet> bullet = new ArrayList<Bullet>();
	ArrayList<Armour> armour= new ArrayList<Armour>();
	ArrayList<Armour2> armour2= new ArrayList<Armour2>();
	Teammate teammate;
	Human human;
	
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
		for(int i=0; i< armour.size(); i++) {
			if(armour.get(i).isAlive==false) {
				armour.remove(i);
			}
		}
		for(int i=0; i< armour2.size();i++) {
			if(armour2.get(i).isAlive==false) {
				armour2.remove(i);
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

	public ObjectManager(Human human2) {
		this.human= human2;
	}

	void setTeammate(Teammate teammate) {
		this.teammate = teammate;
	}

	void draw(Graphics g) {
		teammate.draw(g);
		human.draw(g);
		//armour.draw(g);
		for (Bullet b : bullet) {
			b.draw(g);
		}
		for (Monster m: monster) {
			m.draw(g);
		}
		for (Armour armour: armour) {
			armour.draw(g);
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
		for (Armour a: armour) {
			a.update();
		}
		for(Armour2 as: armour2) {
			as.update();
		}
	}
	
	void checkCollision() {
		for (Monster m: monster) {
			if(human.collisionbox.intersects(m.collisionbox)){
				human.isAlive= false;
				System.out.println("Human is dead!");
			} 
			else if(teammate.collisionbox.intersects(m.collisionbox)){
				teammate.takesDamage();
				System.out.println("Teammate is dead");
			}
		for (Bullet b : bullet) {
			if (b.collisionbox.intersects(m.collisionbox)) {
				System.out.println("hit");
				m.isAlive= false;
			}
		}
//		for(Armour2 a: armour2) {
//			if(a.collisionbox.intersects(m.collisionbox)) {
//				a.isAlive=false;
//				System.out.println("Dead armour2!");
//			}
//		}
//		for(Armour as: armour) {
//			if(as.collisionbox.intersects(m.collisionbox)) {
//				as.isAlive=false;
//				System.out.println("Dead armour!");
//			}
//		}
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

	void addMonster(Monster m) {
		monster.add(m);	
	}

	void addArmour(Armour arm) {
		armour.add(arm);
	}

	public void addArmour2(Armour2 arm) {
		armour2.add(arm);
		
	}


}
