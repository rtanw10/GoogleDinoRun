import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class saver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class saver extends Actor
{
    /**
     * Act - do whatever the saver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int image = Greenfoot.getRandomNumber(4);
    public void act() 
    {
        if (isTouching(Dirt.class)){ 
           removeTouching(Dirt.class);
           getWorld().addObject(new Dirt(), 774, 428);
        }
        if (isTouching(cloud.class)) {
            removeTouching(cloud.class);
            getWorld().addObject(new cloud(), 754, 54);
        }
        if (isTouching(Cactus.class)) {
            removeTouching(Cactus.class);
            if(image == 0)
            {
                getWorld().addObject(new Cactus1(), 789, 394);
                
            }
            if(image == 1)
            {
                getWorld().addObject(new Cactus2(), 789, 394);

                
            }
            if(image == 2)
            {
                getWorld().addObject(new Cactus3(), 789, 394);

                
            }
            if(image == 3)
            {
                getWorld().addObject(new Cactus4(), 789, 394);

                
            }
            image = Greenfoot.getRandomNumber(4);
        }
    }    
}
