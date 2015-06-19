import greenfoot.*;
import java.lang.IllegalArgumentException;

public class Mage extends Character {
    public Mage() {
        super();
        face("f");
    }

    public void face(String direction) {
        if(direction.equals("f")) {
            setImage("MageFront.png");
        } else if(direction.equals("b")) {
            setImage("MageBack.png");
        } else if(direction.equals("l")) {
            setImage("MageLeft.png");
        } else if(direction.equals("r")) {
            setImage("MageRight.png");
        } else {
            throw new java.lang.IllegalArgumentException();
        }
    }
}
