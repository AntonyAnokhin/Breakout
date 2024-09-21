import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    private int deltaY = 2;
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation (getX(), getY() - deltaY);
        Block block = (Block) getOneIntersectingObject(Block.class);
         if (getY() <= 0)
        {
            getWorld().removeObject(this);
            return;
        }
        if (block != null)
        {
            block.setLife(block.getLife() - 1);
            if (block.getLife() == 0)
            {
                Board board = (Board) getWorld();
                board.counter.addScore(1);
                board.ball.createPowerUps(block);
                board.removeObject(block);
            }
            else
            {
                block.changeImage();
            }
            getWorld().removeObject(this);
        }
    }
}
