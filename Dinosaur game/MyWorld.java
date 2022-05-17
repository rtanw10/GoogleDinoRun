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
        super(800, 500, 1); 
        addObject(new saver(), 5, 227);
        addObject(new Ground(), 400, 472);
        addObject(new saver(), 4, 346);
        addObject(new saver3(), 377, 359);
        addObject(new Dino(), 162, 394);
        addObject(new cloud(), 754, 54);
        addObject(new Dirt(), 774, 428);
        addObject(new Dirt(), 681, 428);
        addObject(new Dirt(), 591, 428);
        addObject(new Dirt(), 497, 428);
        addObject(new Dirt(), 313, 428);
        addObject(new Dirt(), 226, 428);
        addObject(new Dirt(), 132, 428);
        addObject(new Dirt(), 58, 428);
        addObject(new Dirt(), 403, 428);
        addObject(new Cactus1(), 789, 394);
        //addObject(new Frame(), 763, 303);
        //addObject(new Frame(), 65, 301);

    }
}
