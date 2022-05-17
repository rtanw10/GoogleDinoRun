import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cloud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cloud extends Actor
{
    /**
     * Act - do whatever the cloud wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-2);
        //reach();
    }    
    public void reach()
    {
       if(getX() == 350 && getY() == 54)
       {
           getWorld().addObject(new cloud(), 798, 151);
           if(isTouching(saver.class))
           {
             removeTouching(cloud.class);
           }
       }
    }
}
