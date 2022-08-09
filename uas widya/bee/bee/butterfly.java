import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class butterfly here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class butterfly extends Actor
{
    /**
     * Act - do whatever the butterfly wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move (1);
        turn (Greenfoot.getRandomNumber(3));
        keyboardControls();
        
        MouseInfo mouse = Greenfoot.gotMouseInfo();
        if (Greenfoot.mouseMoved(this))
        
        {
            setLocation (mouse.getX(), mouse.getY());
        }
    }
    public void keyboardControls()
    {
        if (Greenfoot.isKeyDown
    }
}
