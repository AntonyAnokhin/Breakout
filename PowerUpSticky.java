import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PowerUpSticky here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PowerUpSticky extends PowerUp
{
    public void powerUp()
    {
        Board board = (Board) getWorld();
        board.powerUpReset();
        board.ball.sticky = true;
    }
}
