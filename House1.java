import greenfoot.*;

/**
 * Write a description of class House1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class House1 extends World
{
    private Main1 main;
    private int b;
    private int return1;
    private int return2;

    public House1(int a, int x, int y, int w, int z)
    {
        super(11, 6, 40);
        b = a;
        return1 = w;
        return2 = z;
        main = new Main1(11, b);
        addObject(main, x, y);

        prepare();
    }

    public void act()
    {
        if(main.getX() == 5 && main.getY() == 5)
        {
            World level = new World4(b, return1, return2);
            Greenfoot.setWorld(level);
        }
    }


    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Barrier barrier = new Barrier();
        addObject(barrier, 2, 3);
        Barrier barrier2 = new Barrier();
        addObject(barrier2, 3, 3);
        Barrier barrier3 = new Barrier();
        addObject(barrier3, 3, 2);
        Barrier barrier4 = new Barrier();
        addObject(barrier4, 2, 2);
        Barrier barrier5 = new Barrier();
        addObject(barrier5, 7, 3);
        Barrier barrier6 = new Barrier();
        addObject(barrier6, 9, 3);
        Barrier barrier7 = new Barrier();
        addObject(barrier7, 9, 1);
        Barrier barrier8 = new Barrier();
        addObject(barrier8, 8, 1);
        Barrier barrier9 = new Barrier();
        addObject(barrier9, 7, 1);
        Barrier barrier1111 = new Barrier();
        addObject(barrier1111, 6, 5);
        Barrier barrier22 = new Barrier();
        addObject(barrier22, 7, 5);
        Barrier barrier33 = new Barrier();
        addObject(barrier33, 8, 5);
        Barrier barrier44 = new Barrier();
        addObject(barrier44, 9, 5);
        Barrier barrier55 = new Barrier();
        addObject(barrier55, 10, 5);
        Barrier barrier66 = new Barrier();
        addObject(barrier66, 10, 4);
        Barrier barrier77 = new Barrier();
        addObject(barrier77, 10, 3);
        Barrier barrier88 = new Barrier();
        addObject(barrier88, 10, 2);
        Barrier barrier99 = new Barrier();
        addObject(barrier99, 10, 1);
        Barrier barrier10 = new Barrier();
        addObject(barrier10, 6, 0);
        Barrier barrier11 = new Barrier();
        addObject(barrier11, 5, 0);
        Barrier barrier12 = new Barrier();
        addObject(barrier12, 4, 0);
        Barrier barrier13 = new Barrier();
        addObject(barrier13, 3, 0);
        Barrier barrier14 = new Barrier();
        addObject(barrier14, 2, 0);
        Barrier barrier15 = new Barrier();
        addObject(barrier15, 1, 0);
        Barrier barrier16 = new Barrier();
        addObject(barrier16, 0, 0);
        Barrier barrier17 = new Barrier();
        addObject(barrier17, 0, 1);
        Barrier barrier18 = new Barrier();
        addObject(barrier18, 0, 2);
        Barrier barrier19 = new Barrier();
        addObject(barrier19, 0, 3);
        Barrier barrier20 = new Barrier();
        addObject(barrier20, 0, 4);
        Barrier barrier21 = new Barrier();
        addObject(barrier21, 0, 5);
        Barrier barrier222 = new Barrier();
        addObject(barrier222, 1, 5);
        Barrier barrier23 = new Barrier();
        addObject(barrier23, 2, 5);
        Barrier barrier24 = new Barrier();
        addObject(barrier24, 3, 5);
        Barrier barrier25 = new Barrier();
        addObject(barrier25, 4, 5);
    }
}
