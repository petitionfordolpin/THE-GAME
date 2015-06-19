import greenfoot.*;

/**
 * Write a description of class World3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World3 extends World
{
    private Main1 main;
    
    private int b;
    /**
     * Constructor for objects of class World3.
     * 
     */
    public World3(int a, int x, int y)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(15, 10, 40);
        b = a;
        main = new Main1(2,a);
        addObject(main, x,y);

        
    }
}
