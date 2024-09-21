import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PowerUpBigBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PowerUpBigBall extends PowerUp
{
    public void powerUp()
    {
        Board board = (Board) getWorld();
        board.powerUpReset();
        board.ball.powerUpBigBall = true;
    }
}
