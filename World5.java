import greenfoot.*;

/**
 * Write a description of class World5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World5 extends World
{
    private Main1 main;
    private int b;

    public World5(int a, int x, int y)
    {
        super(15, 10, 40);
        b = a;
        main = new Main1(4,a);
        addObject(main, x,y);

        prepare();
    }

    /**
     * Constructor for objects of class World5.
     * 
     */
    public World5()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        House11 house11 = new House11(5);
        addObject(house11, 8, 3);
        house11.setLocation(9, 2);
    }
}
