import greenfoot.*;
import java.awt.Color;

public class World1 extends World
{
    private Warrior warrior;
    private Mage mage;
    private int x = getWidth()/2;
    private int y = getHeight()/2;

    public World1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
    }

    public void prepare()
    {
        showText("Press W to choose Warrior, Press M to choose Mage", 300, 150);
        warrior = new Warrior(0);
        addObject(warrior, 200, 300);
        mage = new Mage(0);
        addObject(mage, 400, 300);
    }

    public void act()
    {
        Greenfoot.delay(25);
        mage.setImage("MageLeft.png");
        warrior.setImage("WarriorLeft.png");
        Greenfoot.delay(25);
        mage.setImage("MageBack.png");
        warrior.setImage("WarriorBack.png");
        Greenfoot.delay(25);
        mage.setImage("MageRight.png");
        warrior.setImage("WarriorRight.png");
        Greenfoot.delay(25);
        mage.setImage("MageFront.png");
        warrior.setImage("WarriorFront.png");
        if(Greenfoot.isKeyDown("m"))
        {
            World level1 = new World2(1, 0 , 1);
            Greenfoot.setWorld(level1);
        }
        if(Greenfoot.isKeyDown("w"))
        {
            World level1 = new World2(2, 0 , 1);
            Greenfoot.setWorld(level1);
        }
    }

    public void clear()
    {
        removeObjects(getObjects(Actor.class));
    }
}
