import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PowerDownLife here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PowerDownLife extends PowerUp
{
    public void powerUp()
    {
        ((Board) getWorld()).life.subLife();
    }
}
