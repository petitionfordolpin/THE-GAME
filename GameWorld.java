import greenfoot.*;
import java.util.ArrayList;

public class GameWorld extends World {
    private ArrayList<Level> levels;

    public GameWorld() {
        super(15, 10, 40);
        addLevels();
    }

    private void addLevels() {
        levels = new ArrayList<Level>();
        levels.add(new GameStart());
        levels.add(new Map1());
        Greenfoot.setWorld(levels.get(0));
    }
}
