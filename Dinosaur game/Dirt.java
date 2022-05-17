import greenfoot.*;
public class Dirt extends Actor
{
    public int random = Greenfoot.getRandomNumber(5)+1;
    public void act()
    {
        move(-12);

    }
    public void getPicture()
    {
        if(random == 1)
        {
            setImage("dirt1.png");
        }
        if(random == 2)
        {
            setImage("dirt2.png");
        }
        if(random == 3)
        {
            setImage("dirt3.png");
        }
        if(random == 4)
        {
            setImage("dirt4.png");
        }
    }
}