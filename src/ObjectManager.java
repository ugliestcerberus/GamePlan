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
void purgeObjects() {
	for(int i=0; i<enemies.size();i++) {
		if(enemies.get(i).isAlive==false) {
			enemies.remove(i);
		}
	}
}
}
