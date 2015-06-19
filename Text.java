import greenfoot.*;
import java.awt.Color;
import java.awt.Font;

/**
 * Write a description of class Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Text extends Actor
{
    private String beta;
    private int size;
    private java.awt.Color color1;
    private java.awt.Color color2;
    public Text()
    {
        
        setImage(new GreenfootImage("Welcome!",30, Color.yellow, Color.gray));
        
    }
    
    public Text(String alpha, int size1, java.awt.Color color11, java.awt.Color color22) 
    {
        // Add your action code here.
        setImage(new GreenfootImage(alpha,size, color11, color22));
        beta = alpha;
        size = size1;
        color1 = color11;
        
    }    
    
    /**
     * Act - do whatever the Text wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void setColor1(java.awt.Color color)
    {
        setImage(new GreenfootImage(beta, size, color, color2));
    }
    
    public void setColor2(java.awt.Color color)
    {
        setImage(new GreenfootImage(beta, size, color1, color));
    }
    
    public void setSize(int zize)
    {
        setImage(new GreenfootImage(beta, zize, color1, color2));
    }
    
    public void setString(String gamma)
    {
        setImage(new GreenfootImage(gamma, size, color1, color2));
    }
}
