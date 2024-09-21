import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Life here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Life extends Actor
{
    private int life;
    
    public Life()
    {
        life = 3;
        setImage(new GreenfootImage(150, 30));
        update();
    }
    
    public void addLife()
    {
        life++;
        update();
    }
    
    public void subLife()
    {
        life--;
        update();
        if (life == 0)
        {
            ((Board) getWorld()).lose();
        }
    }
    
    private void update()
    {
        GreenfootImage img = getImage();
        img.clear();
        img.setColor(Color.BLACK);
        img.setFont(new Font(20));
        img.drawString("Life: " + life, 4 , 20);
    }
}
