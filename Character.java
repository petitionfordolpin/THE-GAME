import greenfoot.*;

public abstract class Character extends Actor {
    private String direction;
    private boolean canMove;

    private static final int INCREMENT = 5;
    private static final int DELAY = 5;

    public Character(String direction, boolean canMove) {
        super();
        face(direction);
        this.canMove = canMove;
    }

    public void act() {
        if(canMove) {
            move();
        }
    }

    public void move() {
        if(Greenfoot.isKeyDown("w")) {
            setDirection("Back");
            setLocation(getX(), getY() - INCREMENT);
            Greenfoot.delay(DELAY);
        } else if(Greenfoot.isKeyDown("d")) {
            setDirection("Right");
            setLocation(getX() - INCREMENT, getY());
            Greenfoot.delay(DELAY);
        } else if(Greenfoot.isKeyDown("s")) {
            setDirection("Front");
            setLocation(getX(), getY() + INCREMENT);
            Greenfoot.delay(DELAY);
        } else if(Greenfoot.isKeyDown("a")) {
            setDirection("Left");
            setLocation(getX() + INCREMENT, getY());
            Greenfoot.delay(DELAY);
        }
    }

    public abstract void face(String direction);

    public String getDirection(){return direction;}

    public void setDirection(String direction){this.direction = direction;}

    public boolean getCanMove(){return canMove;}

    public void setCanMove(boolean canMove){this.canMove=canMove;}
}
