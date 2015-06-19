import greenfoot.*;

public abstract class Character extends Actor {
    private static final int INCREMENT = 1;
    private static final int DELAY = 5;
    
    public Character() {
        super();
    }
    
    public void act() {
        move();
    }
    
    public void move() {
        if(Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - INCREMENT);
            Greenfoot.delay(DELAY);
        } else if(Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + INCREMENT);
            Greenfoot.delay(DELAY);
        } else if(Greenfoot.isKeyDown("a")) {
            setLocation(getX() - INCREMENT, getY());
            Greenfoot.delay(DELAY);
        } else if(Greenfoot.isKeyDown("d")) {
            setLocation(getX() + INCREMENT, getY());
            Greenfoot.delay(DELAY);
        }
    }

    public abstract void face(String direction);
}
