import greenfoot.*;
import java.lang.IllegalArgumentException;

public class Warrior extends Character {
    public Warrior() {
        super();
        face("f");
    }

    public void face(String direction) {
        if(direction.equals("f")) {
            setImage("WarriorFront.png");
        } else if(direction.equals("b")) {
            setImage("WarriorBack.png");
        } else if(direction.equals("l")) {
            setImage("WarriorLeft.png");
        } else if(direction.equals("r")) {
            setImage("WarriorRight.png");
        } else {
            throw new java.lang.IllegalArgumentException();
        }
    }
}
