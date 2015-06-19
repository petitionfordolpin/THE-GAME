import greenfoot.*;

public class Warrior extends Character {
    public Warrior(String direction, boolean canMove) {
        super(direction, canMove);
    }

    public void face(String direction) {
        setDirection(direction);
        setImage("Warrior" + direction + ".png");
    }
}
