import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IronBlock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IronBlock extends Block
{
    public IronBlock()
    {
        super(3);
    }
    
    /**
     * Act - do whatever the IronBlock wants to do. This method is called whenever
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
            setImage("iron_1.png");
        }
        if (life == 1)
        {
            setImage("iron_2.png");
        }
    }
    
    public void destroySound()
    {
        
    }
}
