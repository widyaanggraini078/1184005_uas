import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bee2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bee2 extends Actor
{
    /**
     * Act - do whatever the bee2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       move (5);
       turn (Greenfoot.getRandomNumber(50));
       turnAtEdge ();
    }
    
    public void turnAtEdge ()
    {
        if (getX() <= 10 || getX() >= getWorld().getWidth() -10) 
        
        {
          turn (180);
        }
        if (getY() <= 10 || getY() >= getWorld(). getHeight() - 10)
        {
            turn(180);
        }
    } 
}
