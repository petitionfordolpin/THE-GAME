import greenfoot.*;

public class World4 extends World
{
    private Mage mage;
    private Warrior warrior;
    private int b;

    public World4(int a, int x, int y)
    {
        super(15, 10, 40);
        b = a;
        if(a == 1)
        {
            mage = new Mage(3);
            addObject(mage, x,y);
        }
        if(a == 2)
        {
            warrior = new Warrior(3);
            addObject(warrior, x,y);
        }

        prepare();
    }

    public World4()
    {
        super(600, 400, 1); 
    }

    private void prepare()
    {
        House1 house1 = new House1();
        addObject(house1, 12, 5);
        House2 house2 = new House2();
        addObject(house2, 12, 1);
        House3 house3 = new House3();
        addObject(house3, 2, 1);
        removeObject(house3);
        House3 house32 = new House3();
        addObject(house32, 3, 1);
        House4 house4 = new House4();
        addObject(house4, 11, 1);
        removeObject(house2);
        House2 house22 = new House2();
        addObject(house22, 2, 5);
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
}
