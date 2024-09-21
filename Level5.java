import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level5 extends Level
{
    final static public int levelScore = 25;
    final static public int ROWS = 6;
    public Block[][] blocks = {
                               {Block.BRICK,Block.IRON,Block.IRON,Block.IRON,Block.BRICK},
                               {Block.WOOD,Block.STONE,Block.BRICK,Block.STONE,Block.WOOD},
                               {Block.BRICK,Block.STONE,Block.BRICK,Block.STONE,Block.BRICK},
                               {Block.CONCRETE, Block.WOOD, Block.BRICK, Block.WOOD, Block.CONCRETE},
                               {Block.STONE, Block.WOOD, Block.STONE, Block.WOOD, Block.STONE},
                               {Block.ICE, Block.CONCRETE, Block.CONCRETE, Block.CONCRETE, Block.ICE}
                              };
    
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
