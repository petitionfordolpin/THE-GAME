import greenfoot.*;

public class World5 extends World {
    private Main1 main;
    private int b;

    public World5(int a, int x, int y) {
        super(15, 10, 40);
        b = a;
        main = new Main1(4,a);
        addObject(main, x,y);

        prepare();
    }


    public World5() {    
        super(600, 400, 1);
    }

    private void prepare() {
        House11 house11 = new House11(5);
        addObject(house11, 8, 3);
        house11.setLocation(9, 2);
    }
}
