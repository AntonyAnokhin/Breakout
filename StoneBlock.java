import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StoneBlock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StoneBlock extends Block
{
    public StoneBlock()
    {
        super(2);
    }
    
    /**
     * Act - do whatever the StoneBlock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void changeImage()
    {
        if (life == 1)
        {
            setImage("stone_1.png");
        }
    }
    
    public void destroySound()
    {
        
    }
}
