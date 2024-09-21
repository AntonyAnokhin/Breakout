import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelCounter extends Actor
{
    private int levelNumber = 0;
    public LevelCounter()
    {
        setImage(new GreenfootImage(200, 30));
        update();
    }
    public void addLevel()
    {
        levelNumber++;
        update();
    }
    public int getLevel()
    {
        return levelNumber;
    }
    private void update()
    {
        GreenfootImage img = getImage();
        img.clear();
        img.setColor(Color.BLACK);
        img.setFont(new Font(20));
        img.drawString("Level: " + levelNumber, 4 , 20);
    }
}
