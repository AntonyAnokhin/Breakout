import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PowerUpShootTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PowerUpShootTwo extends PowerUp
{
    public void powerUp()
    {
        Board board = (Board) getWorld();
        board.powerUpReset();
        board.paddle.powerUpShootTwo = true;
    }
}
