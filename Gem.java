import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gem extends Actor
{
    private int deltaY = 2;
    /**
     * Act - do whatever the Gem wants to do. This method is called whenever
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
            ((Board) getWorld()).counter.addScore(100);
            getWorld().removeObject(this);
        }
    }
}
