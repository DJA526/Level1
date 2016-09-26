import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class BugX {
	
	public static void main(String[] args) {
		BugX a = new BugX();
	}
	
	BugX() {
		World world = new World();
		int y = 0;
		int x = 0;
		int a = 9;
		int b = 0;
		for (int i = 0; i < 10; i++) {
			Location bugLoc = new Location(y, x);
			Bug bug = new Bug();
			world.add(bugLoc, bug);
			y++;
			x++;
		}
		for (int i = 0; i < 10; i++) {
			Location bug2Loc = new Location(a, b);
			Bug bug2 = new Bug();
			world.add(bug2Loc, bug2);
			a--;
			b++;
		}
		world.show();
	}

}
