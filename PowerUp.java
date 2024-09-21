import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PowerUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PowerUp extends Actor
{
    private int deltaY;
    public PowerUp()
    {
        deltaY = 2;
    }
    
    /**
     * Act - do whatever the PowerUp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation (getX(), getY() + deltaY);
        Actor paddle = getOneIntersectingObject(Paddle.class);
        if (getY() >= getWorld().getHeight()-1)
        {
            getWorld().removeObject(this);
        }
        if (paddle != null) 
        {
            powerUp();
            getWorld().removeObject(this);
        }
    }
    
    public void powerUp()
    {
        
    }
}
