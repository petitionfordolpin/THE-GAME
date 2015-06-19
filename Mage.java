import greenfoot.*;

public class Mage extends Character {
    public Mage(String direction, boolean canMove) {
        super(direction, canMove);
    }

    public void face(String direction) {
        setDirection(direction);
        setImage("Mage" + direction + ".png");
    }
}
