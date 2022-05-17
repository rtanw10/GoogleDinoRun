import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
/**
 * Write a description of class Spieler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spieler extends Actor
{
  int  acceleration = -1;
  private int vSpeed;
  int speed = 5;
  int jumpStrenght = 4;
  public static final int GRAVITY = 1;
   
    /**
     * Act - do whatever the Spieler wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        // Add your action code here.
        //if ( getObjects(GameOver.class).isEmpty() && ! getObjects(Grape.class).isEmpty())
       int dir = (int)Math.signum(vSpeed); // 1, 0 or -1 (direction of vertical movement)
       if(isTouching(Ground.class))
       {
           setLocation(getX(), getY()-dir); // edging back off the platform
           vSpeed = 0; // kill speed on hitting a platform
        }
    } 
     
    
}
