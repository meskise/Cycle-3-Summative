import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Woodcutter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Woodcutter extends Actor
{
    int deltaX;
    int deltaY;
    boolean isFacingRight;
    
    /**
     * Act - do whatever the Woodcutter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movementKeys();
    } 
    
    public void movementKeys()
    {
        double deltaX = 0;
        double deltaY = 0;
        // Movement Keys
        if (Greenfoot.isKeyDown("a"))
        {
            deltaX = - 3.5;
        }
        
        if (Greenfoot.isKeyDown("d"))
        {
            deltaX = + 3.5;
        }
        
        // Allows movement
        setLocation(getX() + (int)deltaX, getY() + (int)deltaY);
        
        // If deltaX is greater than 0 then facing right is true.
        if (deltaX > 0)
        {
            isFacingRight = true;
        }
        // If deltaX is less than 0 then facing right is false.
        else if (deltaX < 0)
        {
            isFacingRight = false;
        }
    }
}
