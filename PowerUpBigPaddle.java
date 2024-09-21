import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PowerUpBigPaddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PowerUpBigPaddle extends PowerUp
{
    public void powerUp()
    {
        Board board = (Board) getWorld();
        board.powerUpReset();
        board.paddle.powerUpBigPaddle = true;
    }
}
