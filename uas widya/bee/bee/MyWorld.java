import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        prepare();
    }
    
    private void prepare()
    {
        bee bee = new bee();
        addObject (bee, 224,176);
        bee2 bee2 = new bee2();
        addObject (bee2, 124, 76);
        fly fly = new fly();
        addObject(fly, 300, 200);
        butterfly butterfly = new butterfly();
        addObject (butterfly, 400, 300); 
    }
}
