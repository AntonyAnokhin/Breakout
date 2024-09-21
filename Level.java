import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Level extends Actor
{
    enum Block
    {
        ICE,
        SAND,
        WOOD,
        STONE,
        IRON,
        BRICK,
        CONCRETE;
    }
    private final static int GAP = 10;
    
    public abstract int getLevelScore();
    
    public abstract Block[][] returnBlocks();
    
    public abstract int returnRows();
    
    public void createLevel()
    {
        Block block;
        World world = getWorld();
        Block blocks[][] = returnBlocks();
        int rows = returnRows();
        for (int i = 0, y = 30; i < rows; i++, y = y + 35 + GAP)
        {
            for (int j = 0, x = 50; j < 5; j++, x = x + 80 + GAP)
            {
                block = blocks[i][j];
                switch (block)
                {
                    case ICE: 
                        world.addObject(new IceBlock(), x, y);
                        break;
                    case SAND:
                        world.addObject(new SandBlock(), x, y);
                        break;
                    case WOOD:    
                        world.addObject(new WoodBlock(), x, y);
                        break;
                    case STONE:
                        world.addObject(new StoneBlock(), x, y);
                        break;
                    case IRON:
                        world.addObject(new IronBlock(), x, y);
                        break;
                    case BRICK:
                        world.addObject(new BrickBlock(), x, y);
                        break;
                    case CONCRETE:
                        world.addObject(new ConcreteBlock(), x, y);
                        break;
                }
            }
        }
    }
    
}
