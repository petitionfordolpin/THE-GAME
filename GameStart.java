import greenfoot.*;

public class GameStart extends Cutscene {
    private Character exampleMage;
    private Character exampleWarrior;
    
    private static final int ROTATE_DELAY = 25;

    public GameStart() {
        super();
        setBackground("grasss.png");
        showText("Press W to choose Warrior, Press M to choose Mage", 300, 150);
        exampleMage = new Mage("Front", false);
        addObject(exampleMage, 200, 275);
        exampleWarrior = new Warrior("Front", false);
        addObject(exampleWarrior, 400, 275);
    }

    public void act() {
        checkForCharacterSelect();
        rotateExampleCharacters();
    }

    private void checkForCharacterSelect() {
        if(Greenfoot.isKeyDown("w")) {
            //
        } else if(Greenfoot.isKeyDown("m")) {
            //
        }
    }

    private void rotateExampleCharacters() {
        Greenfoot.delay(ROTATE_DELAY);
        if(exampleMage.getDirection().equals("Back")) {
            exampleMage.face("Right");
            exampleWarrior.face("Right");
        } else if(exampleMage.getDirection().equals("Right")) {
            exampleMage.face("Front");
            exampleWarrior.face("Front");
        } else if(exampleMage.getDirection().equals("Front")) {
            exampleMage.face("Left");
            exampleWarrior.face("Left");
        } else if(exampleMage.getDirection().equals("Left")) {
            exampleMage.face("Back");
            exampleWarrior.face("Back");
        }
    }
}