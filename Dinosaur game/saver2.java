import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class saver2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class saver2 extends Actor
{
    /**
     * Act - do whatever the saver2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        if (isTouching(cloud.class)) {
            removeTouching(cloud.class);
        }
    }    
}
