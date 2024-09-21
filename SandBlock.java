import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SandBlock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SandBlock extends Block
{
    public SandBlock()
    {
        super(1);
    }
    
    /**
     * Act - do whatever the SandBlock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void destroySound()
    {
        Greenfoot.playSound("1.wav");
    }
}
