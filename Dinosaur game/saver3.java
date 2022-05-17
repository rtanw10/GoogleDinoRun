import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class saver3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class saver3 extends Actor
{
    /**
     * Act - do whatever the saver3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int image = Greenfoot.getRandomNumber(4);
    public void act() 
    {
    }    
    public void touchCactus()
    {
        
        if(isTouching(Cactus.class))
        {
            
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
            removeTouching(Cactus.class);
        }
    }
}
