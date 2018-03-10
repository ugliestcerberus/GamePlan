import java.util.ArrayList;

public class ObjectManager {
	int x;
	int y;
	int width;
	int height;
	int score=0;
	long enemyTimer=System.currentTimeMillis();
	int enemySpawnTime=1000;
	ArrayList<Enemies>enemies= new ArrayList<Enemies>();
	ArrayList<Bullet>bullet= new ArrayList<Bullet>();
void purgeObjects() {
	for(int i=0; i<enemies.size();i++) {
		if(enemies.get(i).isAlive==false) {
			enemies.remove(i);
		}
	}
	for(int i=0;i<bullet.size();i++) {
		if(bullet.get(i).isAlive==false) {
			bullet.remove(i);
		}
	}
}
void addBullet(Bullet b) {
	bullet.add(b);
}
void addEnemy(Enemies e) {
	enemies.add(e);
}
}
