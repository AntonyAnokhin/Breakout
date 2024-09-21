import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PowerDownSmallBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PowerDownSmallBall extends PowerUp
{
    public void powerUp()
    {
        Board board = (Board) getWorld();
        board.powerUpReset();
        board.ball.powerDownSmallBall = true;
    }
}
