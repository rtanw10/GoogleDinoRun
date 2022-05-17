import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dino here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dino extends Actor
{
    /**
     * Act - do whatever the Dino wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage image = new GreenfootImage("walkLeft.png");
    private GreenfootImage image2 = new GreenfootImage("walkRight.png");
    private int ySpeed;
    public int score = 0;
    private int gravity;
    private int counter = 0;
    private int counter2 = 0;
    private int speed = 7;
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpStrength = 12;
    private int delay = 0;
    
    public void act() 
    {
        score = score + 1;
        getWorld().showText("Score: " + score, 60, 51);
        switchImage();
        control();
        touchCactus();
        checkFall();
        checkKeys();
    }  
    public Dino()
    {
        score = 0;
    }
    public void control()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            setImage("stand.gif");
        }
        if(Greenfoot.isKeyDown("up"))
        {

        }
        if(Greenfoot.isKeyDown("down"))
        {
           setImage("bend.png");
        }
    }
    public void switchImage()
    {
       if(getImage() == image)
       {
           Greenfoot.delay(2);
           setImage(image2);
       }
       else
       {
           Greenfoot.delay(2);
           setImage(image);
       }
    }
        
    
    private void checkForJump()
    {
       Actor a = getOneIntersectingObject(Ground.class);
       if (a != null) {
         gravity = 20; // this will make the character jump
       }
    }
    public void touchCactus()
    {
        if(isTouching(Cactus.class))
        {
            setImage("hitCactus.png");
            Greenfoot.stop();
        }
    }
    public boolean onGround()
    {
        Object under = getOneObjectAtOffset(0, getImage().getHeight()/2 + 2, Ground.class);
        return under != null;
    }
    public void jump()
   {
       setImage("stand.gif");
       touchCactus();
       vSpeed = -jumpStrength;
       Fall();
        
    }
    public void checkKeys()
    {

        if(Greenfoot.isKeyDown("space") && onGround())
       {
          setImage("stand.gif");
          jump(); 
        }
   }
    public void Fall()
    {
     setImage("stand.gif");
     touchCactus();
     setLocation (getX(), getY() + vSpeed);
     vSpeed = vSpeed += acceleration;
    }
    public void checkFall()
    {
     if (onGround())
     {
        vSpeed = 0;}
      else {
        Fall();
     }
}
}