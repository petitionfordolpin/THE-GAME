import greenfoot.*;

public class World4 extends World
{
    private Main1 main;
    private int b;
    private House11 house1;
    private House11 house2;
    private House11 house3;
    private House11 house4;
    public World4(int a, int x, int y)
    {
        super(15, 10, 40);
        b = a;
        main = new Main1(3,a);
        addObject(main, x,y);
        prepare();
    }

    public World4()
    {
        super(600, 400, 1);
    }
    
    public void act()
    {
        checkHouse();
    }
    
    private void prepare()
    {
        house1 = new House11(1);
        addObject(house1, 12, 5);
        house3 = new House11(3);
        addObject(house3, 3, 1);

        house4 = new House11(4);
        addObject(house4, 11, 1);

        house2 = new House11(2);
        addObject(house2, 2, 5);

        Barrier barrier = new Barrier();
        addObject(barrier, 11, 6);
        Barrier barrier2 = new Barrier();
        addObject(barrier2, 13, 6);
        Barrier barrier3 = new Barrier();
        addObject(barrier3, 11, 5);
        Barrier barrier4 = new Barrier();
        addObject(barrier4, 12, 5);
        Barrier barrier5 = new Barrier();
        addObject(barrier5, 13, 5);
        Barrier barrier6 = new Barrier();
        addObject(barrier6, 10, 2);
        Barrier barrier7 = new Barrier();
        addObject(barrier7, 11, 2);
        Barrier barrier8 = new Barrier();
        addObject(barrier8, 10, 1);
        Barrier barrier9 = new Barrier();
        addObject(barrier9, 11, 1);
        Barrier barrier10 = new Barrier();
        addObject(barrier10, 12, 1);
        Barrier barrier11 = new Barrier();
        addObject(barrier11, 4, 2);
        Barrier barrier12 = new Barrier();
        addObject(barrier12, 3, 2);
        Barrier barrier13 = new Barrier();
        addObject(barrier13, 3, 1);
        Barrier barrier14 = new Barrier();
        addObject(barrier14, 2, 1);
        Barrier barrier15 = new Barrier();
        addObject(barrier15, 4, 1);
        Barrier barrier16 = new Barrier();
        addObject(barrier16, 1, 6);
        Barrier barrier17 = new Barrier();
        addObject(barrier17, 1, 5);
        Barrier barrier18 = new Barrier();
        addObject(barrier18, 2, 5);
        Barrier barrier19 = new Barrier();
        addObject(barrier19, 3, 5);
        Barrier barrier20 = new Barrier();
        addObject(barrier20, 3, 6);
    }
    
    public void checkHouse()
    {
        for(int p = 1; p < 5; p++)
        {
            if(foundMain2(p))
            {
                World level = new House1(getB(), 5,4, main.getX(), main.getY()+1);
                Greenfoot.setWorld(level);
            }
        }
    }
    
    public boolean foundMain2(int a)
    {
        if(a == 1)
        {
            return(house1.foundMain1());
        }
        if(a == 2)
        {
            return(house2.foundMain1());
        }
        if(a == 3)
        {
            return(house3.foundMain1());
        }
        if(a == 4)
        {
            return(house4.foundMain1());
        }
        return(false);
    }
    
    public int getB()
    {
        return(b);
    }
}
