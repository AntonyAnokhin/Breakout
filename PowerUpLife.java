import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PowerUpLife here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PowerUpLife extends PowerUp
{
    public void powerUp()
    {
        ((Board) getWorld()).life.addLife();
    }
}
