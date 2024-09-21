import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    public int score;
    
    public Counter()
    {
        score = 0;
        setImage(new GreenfootImage(200, 30));
        update();
    }
    
    public void addScore(int value)
    {
        score = score + value;
        update();
    }
    
    public void subScore()
    {
        score--;
        update();
    }
    
    private void update()
    {
        GreenfootImage img = getImage();
        img.clear();
        img.setColor(Color.BLACK);
        img.setFont(new Font(20));
        img.drawString("Score: " + score, 4 , 20);
    }
}

