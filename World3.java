import greenfoot.*;

public class World3 extends World {
    private Main1 main;
    private int b;

    public World3(int a, int x, int y) {
        super(15, 10, 40);
        b = a;
        main = new Main1(2, a);
        addObject(main, x, y);
    }
}
