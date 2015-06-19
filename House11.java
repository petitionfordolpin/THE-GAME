import greenfoot.*;

public class House11 extends Actor {
    private int x;

    public House11(int x1) {
        x = x1;
        if(x1 == 1) {
            setImage("House1.png");
        }
        if(x1 == 2) {
            setImage("House2.png");
        }
        if(x1 == 3) {
            setImage("House3.png");
        }
        if(x1 == 4) {
            setImage("House4.png");
        }
        if(x1 == 5) {
            setImage("Theship.png");
        }
    }

    public void act() {
        //
    }

    public boolean foundMain1() {
        if(x == 1 || x == 2)
            return(getOneObjectAtOffset(0, +1, Main1.class) != null);
        if(x == 3)
            return(getOneObjectAtOffset(-1, +1, Main1.class) != null);
        if(x == 4)
            return(getOneObjectAtOffset(+1, +1, Main1.class) != null);
        return(getOneObjectAtOffset(+1, +1, Main1.class) != null);
    }
}
