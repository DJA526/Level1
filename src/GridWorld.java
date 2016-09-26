import java.awt.Color;
import java.util.Random;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	
	public static void main(String[] args) {
		World world = new World();
		world.show();
		
		Bug bug = new Bug();
		Location bugLoc = new Location(0,0);
		world.add(bugLoc, bug);
		
		Bug bug2 = new Bug();
		int y = new Random().nextInt(7);
		int x = new Random().nextInt(7);
		Location bug2Loc = new Location(y, x);
		world.add(bug2Loc, bug2);
		bug2.setColor(Color.BLUE);
		bug2.turn();
		bug2.turn();
		
		Location flower1Loc = new Location(y, x-1);
		Flower flower1 = new Flower();
		world.add(flower1Loc, flower1);
		Location flower2Loc = new Location(y, x+1);
		Flower flower2 = new Flower();
		world.add(flower2Loc, flower2);
		
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
			Location flowerLoc = new Location(i,j);
			Flower flower = new Flower();
			world.add(flowerLoc, flower);
			if (i%2 == 0) {
				flower.setColor(Color.red);
			} else {
				flower.setColor(Color.white);
			}
			}
		}
		
	}

}
