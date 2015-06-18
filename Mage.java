import greenfoot.*;

public class Mage extends Main
{
    private int world;

    public Mage(int world1)
    {
        world = world1;
    }

    public void act() 
    {
        /*
        if(world == 0)
        {
        Greenfoot.delay(25);
        setImage("MageLeft.png");

        Greenfoot.delay(25);
        setImage("MageBack.png");

        Greenfoot.delay(25);
        setImage("MageRight.png");

        Greenfoot.delay(25);
        setImage("MageFront.png");

        }
         */
        if(world == 1 || world == 3 || world == 2)
        {
            if(Greenfoot.isKeyDown("s") && noTock(1))
            {
                setLocation(getX(), getY() + 1);
                setImage("MageFront.png");
                activate();
                Greenfoot.delay(15);
            }
            if(Greenfoot.isKeyDown("d") && noTock(2))
            {
                setLocation(getX() + 1, getY());
                setImage("MageRight.png");
                activate();
                Greenfoot.delay(15);
            }
            if(Greenfoot.isKeyDown("a") && noTock(3))
            {
                setLocation(getX() - 1, getY());
                setImage("MageLeft.png");
                activate();
                Greenfoot.delay(15);
            }
            if(Greenfoot.isKeyDown("w") && noTock(4))
            {
                setLocation(getX(), getY() - 1);
                setImage("MageBack.png");
                activate();
                Greenfoot.delay(15);
            }
        }
    }    

    public boolean checkTree()
    {
        Actor check = getOneObjectAtOffset(0, -1, Tree.class);
        if(check != null)
        {
            return(false);
        }
        else
            return(true);
    }

    public boolean noTock(int one)
    {
        if(one == 1)
        {
            Actor check = getOneObjectAtOffset(0, 1, Barrier.class);
            if(check != null)
            {
                return(false);
            }
            else
                return(true);
        }
        if(one == 2)
        {
            Actor check = getOneObjectAtOffset(1, 0, Barrier.class);
            if(check != null)
            {
                return(false);
            }
            else
                return(true);
        }
        if(one == 3)
        {
            Actor check = getOneObjectAtOffset(-1, 0, Barrier.class);
            if(check != null)
            {
                return(false);
            }
            else
                return(true);
        }
        if(one == 4)
        {
            Actor check = getOneObjectAtOffset(0, -1, Barrier.class);
            if(check != null)
            {
                return(false);
            }
            else
                return(true);
        }
        return(true);
    }

    public void activate()
    {
        if(Greenfoot.isKeyDown("d") && getX() == 14 && getY() == 1 && world == 1)
        {
            World level2 = new World3(1, 0 , 1);
            Greenfoot.setWorld(level2);
        }
        if(Greenfoot.isKeyDown("a") && getX() == 0 && getY() == 1 && world == 2)
        {
            World level2 = new World2(1, 14, 1);
            Greenfoot.setWorld(level2);
        }
        if(Greenfoot.isKeyDown("s") && getX() == 7 && getY() == 9 && world == 1)
        {
            World level2 = new World4(1, 7, 0);
            Greenfoot.setWorld(level2);
        }
        if(Greenfoot.isKeyDown("w") && getX() == 7 && getY() == 0 && world == 3)
        {
            World level2 = new World2(1, 7, 9);
            Greenfoot.setWorld(level2);
        }
    }
}
