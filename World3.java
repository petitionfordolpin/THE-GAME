import greenfoot.*;

public class World3 extends World
{
    private Mage mage;
    private Warrior warrior;
    private int b;

    public World3(int a, int x, int y)
    {
        super(15, 10, 40);
        b = a;
        if(a == 1)
        {
            mage = new Mage(2);
            addObject(mage, x,y);
        }
        if(a == 2)
        {
            warrior = new Warrior(2);
            addObject(warrior, x,y);
        }
    }
}
