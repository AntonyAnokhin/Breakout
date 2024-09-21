import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickBlock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BrickBlock extends Block
{
    public BrickBlock()
    {
        super(3);
    }
    
    /**
     * Act - do whatever the BrickBlock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void changeImage()
    {
        if (life == 2)
        {
            setImage("brick_1.png");
        }
        if (life == 1)
        {
            setImage("brick_2.png");
        }
    }
    
    public void destroySound()
    {
        
    }
}
