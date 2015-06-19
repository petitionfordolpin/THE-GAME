import greenfoot.*;


public class Main1 extends Actor {
    private int world;
    private int character;

    public Main1(int world1, int x) {
        world = world1;
        character = x;
        if(x == 2) {
            setImage("WarriorFront.png");
        }
        if(x == 1) {
            setImage("MageFront.png");
        }
    }

    public boolean noTock(int one) {
        if(one == 1) {
            Actor check = getOneObjectAtOffset(0, 1, Barrier.class);
            return check == null;
        }

        if(one == 2) {
            Actor check = getOneObjectAtOffset(1, 0, Barrier.class);
            return check == null;
        }
        if(one == 3) {
            Actor check = getOneObjectAtOffset(-1, 0, Barrier.class);
            return check == null;
        }
        if(one == 4) {
            Actor check = getOneObjectAtOffset(0, -1, Barrier.class);
            return check == null;
        }
        return true;
    }


    public void act() {
        if(character == 2) {
            if(Greenfoot.isKeyDown("s") && noTock(1)) {
                setLocation(getX(), getY() + 1);
                setImage("WarriorFront.png");
                activate();
                Greenfoot.delay(15);
            }
            if(Greenfoot.isKeyDown("d") && noTock(2)) {
                setLocation(getX() + 1, getY());
                setImage("WarriorRight.png");
                activate();
                Greenfoot.delay(15);
            }
            if(Greenfoot.isKeyDown("a") && noTock(3)) {
                setLocation(getX() - 1, getY());
                setImage("WarriorLeft.png");
                activate();
                Greenfoot.delay(15);
            }
            if(Greenfoot.isKeyDown("w") && noTock(4)) {
                setLocation(getX(), getY() - 1);
                setImage("WarriorBack.png");
                activate();
                Greenfoot.delay(15);
            }
        }
        if(character == 1) {
            if(Greenfoot.isKeyDown("s") && noTock(1)) {
                setLocation(getX(), getY() + 1);
                setImage("MageFront.png");
                activate();
                Greenfoot.delay(15);
            }
            if(Greenfoot.isKeyDown("d") && noTock(2)) {
                setLocation(getX() + 1, getY());
                setImage("MageRight.png");
                activate();
                Greenfoot.delay(15);
            }
            if(Greenfoot.isKeyDown("a") && noTock(3)) {
                setLocation(getX() - 1, getY());
                setImage("MageLeft.png");
                activate();
                Greenfoot.delay(15);
            }
            if(Greenfoot.isKeyDown("w") && noTock(4)) {
                setLocation(getX(), getY() - 1);
                setImage("MageBack.png");
                activate();
                Greenfoot.delay(15);
            }
        }
    }

    public boolean checkTree() {
        Actor check = getOneObjectAtOffset(0, -1, Tree.class);
        return check == null;
    }

    public void activate() {
        if(Greenfoot.isKeyDown("d") && getX() == 14 && getY() == 1 && world == 1) {
            World level2 = new World3(character, 0 , 1);
            Greenfoot.setWorld(level2);
        }
        if(Greenfoot.isKeyDown("a") && getX() == 0 && getY() == 1 && world == 2) {
            World level2 = new World2(character, 14, 1);
            Greenfoot.setWorld(level2);
        }
        if(Greenfoot.isKeyDown("s") && getX() == 7 && getY() == 9 && world == 1) {
            World level2 = new World4(character, 7, 0);
            Greenfoot.setWorld(level2);
        }
        if(Greenfoot.isKeyDown("w") && getX() == 7 && getY() == 0 && world == 3) {
            World level2 = new World2(character, 7, 9);
            Greenfoot.setWorld(level2);
        }
        if(Greenfoot.isKeyDown("d") && getX() == 14 && getY() == 1 && world == 2) {
            World level2 = new World5(character, 0, 1);
            Greenfoot.setWorld(level2);
        }
        if(Greenfoot.isKeyDown("a") && getX() == 0 && getY() == 1 && world == 4) {
            World level2 = new World3(character, 14, 1);
            Greenfoot.setWorld(level2);
        }
    }


}
