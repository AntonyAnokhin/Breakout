import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PowerUpGoThrough here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PowerUpGoThrough extends PowerUp
{
     public void powerUp()
     {
        Board board = (Board) getWorld();
        board.powerUpReset();
        board.ball.goThrough = true;
     }
}
