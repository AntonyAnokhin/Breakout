import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PowerDownSmallPaddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PowerDownSmallPaddle extends PowerUp
{
    public void powerUp()
    {
        Board board = (Board) getWorld();
        board.powerUpReset();
        board.paddle.powerDownSmallPaddle = true;
    }
}
