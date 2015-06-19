import greenfoot.*;

public class World2 extends World
{
    private Main1 main;
    private int b;

    public World2(int a, int x, int y)
    {
        super(15, 10, 40);
        b = a;
        main = new Main1(1, a);
        addObject(main, x, y);
        prepare();
    }

    public void act()
    {
        if(!main.checkTree()) {
            setPaintOrder(new Class[] {Main1.class, Tree.class});

        } else {
            setPaintOrder(new Class[] {Tree.class, Main1.class});
        }
    }

    private void prepare()
    {
        Tree tree = new Tree();
        addObject(tree, 14, 3);
        Tree tree2 = new Tree();
        addObject(tree2, 10, 3);
        tree2.setLocation(10, 3);
        removeObject(tree2);
        Tree tree3 = new Tree();
        addObject(tree3, 13, 6);
        Tree tree4 = new Tree();
        addObject(tree4, 10, 7);
        Tree tree5 = new Tree();
        addObject(tree5, 12, 8);
        Tree tree6 = new Tree();
        addObject(tree6, 8, 6);
        Tree tree7 = new Tree();
        addObject(tree7, 5, 7);
        Tree tree8 = new Tree();
        addObject(tree8, 10, 3);
        Tree tree9 = new Tree();
        addObject(tree9, 11, 2);
        tree8.setLocation(10, 3);
        Tree tree10 = new Tree();
        addObject(tree10, 8, 2);
        Tree tree11 = new Tree();
        addObject(tree11, 4, 3);
        Tree tree12 = new Tree();
        addObject(tree12, 5, 2);
        Tree tree13 = new Tree();
        addObject(tree13, 1, 5);
        Tree tree14 = new Tree();
        addObject(tree14, 3, 5);
        tree14.setLocation(3, 6);
        Tree tree15 = new Tree();
        addObject(tree15, 1, 8);
        Tree tree16 = new Tree();
        addObject(tree16, 1, 2);

        Barrier barrier2 = new Barrier();
        addObject(barrier2, 12, 8);

        Barrier barrier4 = new Barrier();
        addObject(barrier4, 13, 6);

        Barrier barrier6 = new Barrier();
        addObject(barrier6, 14, 3);

        Barrier barrier8 = new Barrier();
        addObject(barrier8, 11, 2);

        Barrier barrier10 = new Barrier();
        addObject(barrier10, 10, 7);

        Barrier barrier12 = new Barrier();
        addObject(barrier12, 10, 3);

        Barrier barrier14 = new Barrier();
        addObject(barrier14, 8, 2);

        Barrier barrier16 = new Barrier();
        addObject(barrier16, 8, 6);

        Barrier barrier18 = new Barrier();
        addObject(barrier18, 5, 2);

        Barrier barrier20 = new Barrier();
        addObject(barrier20, 4, 3);

        Barrier barrier22 = new Barrier();
        addObject(barrier22, 5, 7);

        Barrier barrier24 = new Barrier();
        addObject(barrier24, 3, 6);

        Barrier barrier26 = new Barrier();
        addObject(barrier26, 1, 8);

        Barrier barrier28 = new Barrier();
        addObject(barrier28, 1, 5);

        Barrier barrier30 = new Barrier();
        addObject(barrier30, 1, 2);
    }
}
