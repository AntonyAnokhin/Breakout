import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Level
{
    final static public int levelScore = 20;
    final static public int ROWS = 4;
    public Block[][] blocks = {
                               {Block.WOOD,Block.STONE,Block.BRICK,Block.STONE,Block.WOOD},
                               {Block.STONE,Block.WOOD,Block.STONE,Block.WOOD,Block.STONE},
                               {Block.ICE,Block.SAND,Block.ICE,Block.SAND,Block.ICE},
                               {Block.ICE, Block.ICE, Block.ICE, Block.ICE, Block.ICE}
                              };
          
    
    /**
     * Act - do whatever the Level1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public int getLevelScore()
    {
        return levelScore;
    }
    
    public Block[][] returnBlocks()
    {
        return blocks;
    }
    
    public int returnRows()
    {
        return ROWS;
    }
}
