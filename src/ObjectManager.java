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
	boolean hit;
	ArrayList<Monster> monster = new ArrayList<Monster>();
	ArrayList<Bullet> bullet = new ArrayList<Bullet>();
	// ArrayList<Armour> armour = new ArrayList<Armour>();
	// ArrayList<Armour2> armour2= new ArrayList<Armour2>();
	// We are not needing the armour to have arrays because the armour is not being used
	int timefromHit = 0;
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
		// for (int i = 0; i < armour.size(); i++) {
		// if (armour.get(i).isAlive == false) {
		// armour.remove(i);
		// We already have code that removes the armour. 
		// It is break;
		// }
		// }
		// for(int i=0; i< armour2.size();i++) {
		// if(armour2.get(i).isAlive==false) {
		// armour2.remove(i);
		//Same as the code above. 
		// }
		// }
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
		this.human = human2;
	}

	void setTeammate(Teammate teammate) {
		this.teammate = teammate;
	}

	void setHuman(Human human) {
		this.human = human;
	}

	void draw(Graphics g) {
		teammate.draw(g);
		human.draw(g);
		for (Bullet b : bullet) {
			b.draw(g);
		}
		for (Monster m : monster) {
			m.draw(g);
		}
		// for (Armour armour : armour) {
		// armour.draw(g);
		//This code is unnecessary because we are not trying to draw armour in this game. 
		// }
		// for(Armour2 armour2: armour2) {
		// armour2.draw(g);
		//This is the same as above. 
		// }
	}

	public void manageMonsters1() {
		if (System.currentTimeMillis() - enemyTimer >= enemySpawnTime) {
			addMonster(new Monster(new Random().nextInt(ThirdScreen.width), new Random().nextInt(ThirdScreen.width), 50, 50, true));
			enemyTimer = System.currentTimeMillis();
		}
	}


	void update() {
		teammate.update();
		human.update();
		for (Bullet b : bullet) {
			b.update();
		}
		for (Monster m : monster) {
			m.update();
		}
		// for (Armour a : armour) {
		// a.update();
		//This code is unnecessary because we are never trying to change the armour 
		// }
		// for(Armour2 as: armour2) {
		// as.update();
		//This is the same as the for statement above. 
		// }
	}

	void checkCollision() {
		if (timefromHit++ > 120) {

			for (Monster m : monster) {
				//System.out.println(timefromHit);
				if (human.collisionbox.intersects(m.collisionbox)) {
					timefromHit = 0;
					System.out.println("hit");
					if (human.armour.isAlive == false) {
						human.isAlive = false;
						System.out.println("Human is dead!");
						drawEndState();
					} else {
						human.armour.isAlive = false;
						break;
					}
				} else if (teammate.collisionbox.intersects(m.collisionbox)) {
					timefromHit = 0;
					System.out.println();
					if (teammate.armour2.isAlive == false) {
						teammate.isAlive = false;
						System.out.println("Teammate is dead");
						drawEndState();
					} else {
						teammate.armour2.isAlive = false;
						break;
					}
				}
				for (Bullet b : bullet) {
					if (b.collisionbox.intersects(m.collisionbox)) {
						System.out.println("hit");
						m.isAlive = false;
						System.out.println(score);
						score++;
					}
				}
			}

			// for(Armour2 a: armour2) {
			// if(a.collisionbox.intersects(m.collisionbox)) {
			// a.isAlive=false;
			// System.out.println("Dead armour2!");
			// }
			// }
			// for(Armour as: armour) {
			// if(as.collisionbox.intersects(m.collisionbox)) {
			// as.isAlive=false;
			// System.out.println("Dead armour!");
			// }
			// }
		}
	}

	public void reset() {

	}

	public int getScore1() {
		return score;
	}

	public void manageMonsters() {
		if (System.currentTimeMillis() - enemyTimer >= enemySpawnTime) {
			addMonster(new Monster(new Random().nextInt(900), new Random().nextInt(500), 50, 50, true));
			enemyTimer = System.currentTimeMillis();
		}
	}
	
	public void drawEndState(){
	JOptionPane.showMessageDialog(null, "Game Over, your score was" + score);	
	}
	
	void addMonster(Monster m) {
		monster.add(m);
	}

	// void addArmour(Armour arm) {
	// armour.add(arm);
	//This piece of code is unnecessary because we are not trying to add armour. Once the armour is hit, then the armour breaks and disappears, not regenerates. 
	// }

	// public void addArmour2(Armour2 arm) {
	// armour2.add(arm);
	// This is the same as the method above. 
	// }

}
