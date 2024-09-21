import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level4 extends Level
{
    final static public int levelScore = 30;
    final static public int ROWS = 6;
    public Block[][] blocks = {
                               {Block.BRICK,Block.IRON,Block.BRICK,Block.IRON,Block.BRICK},
                               {Block.WOOD,Block.IRON,Block.IRON,Block.IRON,Block.WOOD},
                               {Block.BRICK,Block.STONE,Block.BRICK,Block.STONE,Block.BRICK},
                               {Block.BRICK, Block.STONE, Block.BRICK, Block.STONE, Block.BRICK},
                               {Block.STONE, Block.BRICK, Block.STONE, Block.BRICK, Block.STONE},
                               {Block.ICE, Block.STONE, Block.SAND, Block.STONE, Block.ICE}
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
