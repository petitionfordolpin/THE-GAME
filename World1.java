import greenfoot.*;
import java.awt.Color;

public class World1 extends World {
    private Main1 main;
    private Main1 main1;
    private int x = getWidth()/2;
    private int y = getHeight()/2;

    public World1() {
        super(600, 400, 1);

        prepare();
    }

    public void prepare() {
        showText("Press W to choose Warrior, Press M to choose Mage", 300, 150);
        main = new Main1(1, 1);
        addObject(main, 200, 300);
        main1 = new Main1(1, 2);
        addObject(main1, 400, 300);
    }

    public void act() {
        Greenfoot.delay(25);
        main.setImage("MageLeft.png");
        main1.setImage("WarriorLeft.png");
        Greenfoot.delay(25);
        main.setImage("MageBack.png");
        main1.setImage("WarriorBack.png");
        Greenfoot.delay(25);
        main.setImage("MageRight.png");
        main1.setImage("WarriorRight.png");
        Greenfoot.delay(25);
        main.setImage("MageFront.png");
        main1.setImage("WarriorFront.png");
        if(Greenfoot.isKeyDown("m")) {
            World level1 = new World2(1, 0 , 1);
            Greenfoot.setWorld(level1);
        }
        if(Greenfoot.isKeyDown("w")) {
            World level1 = new World2(2, 0 , 1);
            Greenfoot.setWorld(level1);
        }
    }

    public void clear() {
        removeObjects(getObjects(Actor.class));
    }
}
