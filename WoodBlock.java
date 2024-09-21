import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WoodBlock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WoodBlock extends Block
{
    public WoodBlock()
    {
        super(2);
    }
    
    /**
     * Act - do whatever the WoodBlock wants to do. This method is called whenever
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
            setImage("wood_1.png");
        }
    }
    
    public void destroySound()
    {
        
    }
}
