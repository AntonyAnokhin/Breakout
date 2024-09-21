import greenfoot.*; 
import java.util.List;
/**
 * The game board. The board had a paddle that can move.
 * 
 * @author mik
 * @version 1.0
 */
public class Board extends World
{
    public Ball ball;
    public Paddle paddle;
    public Counter counter;
    public Life life;
    public int maxScore = 0;
    private final static int GAP = 10;
    private long timer = 0;
    private LevelCounter levelCounter;
    private final static int LEVEL_NUMBER = 5;
    public boolean hadGem = false;

    /**
     * Constructor for objects of class Board.
     * 
     */
    public Board()
    {    
        super(460, 520, 1);
        setPaintOrder ( Ball.class, Smoke.class );

        counter = new Counter();
        addObject(counter, 100, 510);

        paddle = new Paddle();
        addObject ( paddle, getWidth() / 2, getHeight() - 40);

        life = new Life();
        addObject(life, 180, 510);

        levelCounter = new LevelCounter();
        addObject(levelCounter, 550, 510);

        nextLevel();
    }

    public void act()
    {
        timer++;      
    }

    public void ballIsOut()
    {
        paddle.newBall();
        powerUpReset();
    }

    public long getTimer()
    {
        return timer;
    }

    public void powerUpReset()
    {
        ball.goThrough = false;
        paddle.powerUpShootOne = false;
        ball.sticky = false;
        paddle.powerUpShootTwo = false;
        paddle.powerDownSmallPaddle = false;
        paddle.powerUpBigPaddle = false;
        ball.powerDownSmallBall = false;
        ball.powerUpBigBall = false;
    }

    public void nextLevel()
    {
        cleanLevel();
        removeObject(ball);
        ballIsOut();
        levelCounter.addLevel();
        Level level = null;
        switch (levelCounter.getLevel())
        {
            case 1: level = new Level1();
                break;
            case 2: level = new Level2();
                break;
            case 3: level = new Level3();
                break;
            case 4: level = new Level4();
                break;
            case 5: level = new Level5();
                break;
        } 
        if (levelCounter.getLevel() < LEVEL_NUMBER + 1)
        {   addObject(level, 0, 0);
            level.createLevel();
            maxScore = maxScore + level.getLevelScore();
        }
        else
        {
            win();
        }
    }
    
    public void cleanLevel()
    {
        List<Block> actors = getObjects(Block.class);
        for (Block blk: actors)
        {
            removeObject((Actor) blk);
        }
        List<PowerUp> powerUps = getObjects(PowerUp.class);
        for (PowerUp pwr: powerUps)
        {
            removeObject((Actor) pwr);
        }
    }
    
    public void win()
    {
        GreenfootImage img = getBackground();
        img.setColor(Color.BLACK);
        img.setFont(new Font(90));
        img.drawString("You Win!!!", 20 , 260);
        Greenfoot.stop();
    }

    public void lose()
    {
        GreenfootImage img = getBackground();
        img.setColor(Color.BLACK);
        img.setFont(new Font(80));
        img.drawString("Game Over", 20 , 260);
        Greenfoot.stop();
    }
}
