import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Block here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Block extends Actor
{
    protected int life;
    
    public Block(int life)
    {
        this.life = life;
    }
    
    public Block()
    {
        
    }
    
    /**
     * Act - do whatever the Block wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    
    public int getLife()
    {
        return life;
    }
    
    public void setLife(int life)
    {
        this.life = life;
    }
    
    public void changeImage()
    {
        
    }
    
    public abstract void destroySound();
}
