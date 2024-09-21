import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends Level
{
    final static public int levelScore = 25;
    final static public int ROWS = 5;
    public Block[][] blocks = {
                               {Block.BRICK,Block.IRON,Block.STONE,Block.IRON,Block.BRICK},
                               {Block.IRON,Block.STONE,Block.IRON,Block.STONE,Block.IRON},
                               {Block.BRICK,Block.WOOD,Block.WOOD,Block.WOOD,Block.BRICK},
                               {Block.BRICK, Block.WOOD, Block.BRICK, Block.WOOD, Block.BRICK},
                               {Block.STONE, Block.STONE, Block.STONE, Block.STONE, Block.STONE}
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
