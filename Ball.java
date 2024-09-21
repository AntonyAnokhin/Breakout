import greenfoot.*;

/**
 * The ball of the game. It moves and bounces off the walls and the paddle.
 * 
 * @author mik
 * @version 1.0
 */
public class Ball extends Actor
{
    private int deltaX ;         // x movement speed
    private int deltaY ;         // y movement speed
    private int count = 2;
    public boolean goThrough = false;
    public boolean sticky = false;
    public boolean stuck = true;   // stuck to paddle
    public boolean powerUpBigBall = false;
    public boolean powerDownSmallBall = false;
    private long tickCount;
    private final int GEM_CHANCE = 150;
    String[] gems = {"BlueGem", "GreenGem", "RedGem"};
    
    /**
     * Act. Move if we're not stuck.
     */
    public void act() 
    {
        Board board = ((Board) getWorld());
        if (powerDownSmallBall == true)
        {
            setImage("1.png");
        }
        else if(powerUpBigBall == true)
        {
            setImage("7.png");
        }
        else
        {
            setImage("ball.png");
        }
        if (!stuck) 
        {
            move();
            if (goThrough)
            {
                makeSmoke();
                checkBlockGoThrough();
            }
            else 
            {
                checkBlock();
            }
            if (board.counter.score == board.maxScore || board.counter.score == board.maxScore + 100)
            {
                board.nextLevel();
            }
            else
            {
                checkOut();
            }
        }
    }

    /**
     * Move the ball. Then check what we've hit.
     */
    public void move()
    {
        setLocation (getX() + deltaX, getY() + deltaY);
        checkPaddle();
        checkWalls();
    }

    /**
     * Check whether we've hit one of the three walls. Reverse direction if necessary.
     */
    private void checkWalls()
    {
        if (getX() == 0 || getX() == getWorld().getWidth()-1) {
            deltaX = -deltaX;
        }
        if (getY() == 0) {
            deltaY = -deltaY;
        }
    }

    /**
     * Check whether we're out (bottom of screen).
     */
    private void checkOut()
    {
        if (getY() == getWorld().getHeight()-1) {
            Board board = (Board) getWorld();
            board.ballIsOut();
            board.life.subLife();
            getWorld().removeObject(this);
        }
    }

    private void checkBlockGoThrough()
    {
        Block block = (Block) getOneIntersectingObject(Block.class);
        if (block != null) 
        {
            if (block.getLife() > 0)
            {
                Board board = (Board) getWorld();
                board.counter.addScore(1);
                createPowerUps(block);
                block.destroySound();
                board.removeObject(block);
            }
            else
            {
                changeDirection(block);
            }
        }
    }

    public void createPowerUps(Block block)
    {
        Board board = (Board) getWorld();
        if (Greenfoot.getRandomNumber(8) == 0)
        {
            switch (Greenfoot.getRandomNumber(10))
            {
                case 0: board.addObject(new PowerUpLife(), block.getX(), block.getY());
                    break;
                case 1: board.addObject(new PowerDownLife(), block.getX(), block.getY());
                    break;
                case 2: board.addObject(new PowerUpGoThrough(), block.getX(), block.getY());
                    break;
                case 3: board.addObject(new PowerUpShootOne(), block.getX(), block.getY());
                    break;
                case 4: board.addObject(new PowerUpSticky(), block.getX(), block.getY());
                    break;
                case 5: board.addObject(new PowerUpShootTwo(), block.getX(), block.getY());
                    break;
                case 6: board.addObject(new PowerDownSmallPaddle(), block.getX(), block.getY());
                    break;
                case 7: board.addObject(new PowerUpBigPaddle(), block.getX(), block.getY());
                    break;
                case 8: board.addObject(new PowerDownSmallBall(), block.getX(), block.getY());
                    break;
                case 9: board.addObject(new PowerUpBigBall(), block.getX(), block.getY());
            }
        }
        else if (Greenfoot.getRandomNumber(GEM_CHANCE) == 0 && ((Board) getWorld ()).hadGem == false)
        {
            Gem gem = new Gem();
            board.addObject(gem, block.getX(), block.getY());
            gem.setImage(gems[Greenfoot.getRandomNumber(3)] + ".png");
            ((Board) getWorld ()).hadGem = true;
        }
    }

    private void checkBlock()
    {
        Block block = (Block) getOneIntersectingObject(Block.class);
        if (block != null)
        {
            changeDirection(block);
            block.setLife(block.getLife() - 1);
            if (block.getLife() == 0)
            {
                Board board = (Board) getWorld();
                board.counter.addScore(1);
                createPowerUps(block);
                block.destroySound();
                board.removeObject(block);
            }
            else
            {
                block.changeImage();
            }

        }
    }

    private void changeDirection(Block block)
    {
        int blockX = block.getX();
        int blockY = block.getY();
        int x = getX();
        int y = getY();
        int ballRadius;
        if (powerUpBigBall)
        {
            ballRadius = 20;
        }
        else
        {
            ballRadius = 8;
        }

        if (x > blockX - (30 + ballRadius) && x < blockX + (30 + ballRadius))
        {
            deltaY = -deltaY;
        }
        else if (y > blockY - (20 + ballRadius) && y < blockY + (20 + ballRadius))
        {
            deltaX = -deltaX;
        }
        else
        {
            deltaX = -deltaX;
            deltaY = - deltaY;
        }

    }

    private void changeDirectionPaddle(Actor paddle)
    {
        int paddleX = paddle.getX();
        int paddleY = paddle.getY();
        int x = getX();
        int y = getY();
        int paddleSize;
        int ballRadius;

        if (powerUpBigBall)
        {
            ballRadius = 20;
        }
        else
        {
            ballRadius = 8;
        }

        if (((Paddle) paddle).powerUpBigPaddle == true)
        {
            paddleSize = 75;
        }
        else if(((Paddle) paddle).powerDownSmallPaddle == true)
        {
            paddleSize = 38;
        }
        else
        {
            paddleSize = 50;
        }

        if (x > paddleX - (paddleSize + ballRadius) && x < paddleX + (paddleSize + ballRadius))
        {
            deltaY = -deltaY;
            int offset = getX() - paddle.getX();
            deltaX = deltaX + (offset/10);
            if (deltaX > 7) {
                deltaX = 7;
            }
            if (deltaX < -7) {
                deltaX = -7;
            }
        }
        else if (y > paddleY - (10 + ballRadius) && y < paddleY + (10 + ballRadius))
        {
            deltaX = -deltaX;
        }
        else
        {
            deltaX = -deltaX;
            deltaY = - deltaY;
        }

    }

    private void checkPaddle()
    {
        Actor paddle = getOneIntersectingObject(Paddle.class);
        if (paddle != null) {
            if (sticky)
            {
                stuck = true;
                ((Board) getWorld()).paddle.myBall = this;
            }    
            else
            {
                if (((Board) getWorld()).getTimer() - tickCount > 9)
                {
                    changeDirectionPaddle(paddle);
                    tickCount = ((Board) getWorld()).getTimer();
                }
            }
        }            
    }

    /**
     * Move the ball a given distance sideways.
     */
    public void move(int dist)
    {
        setLocation (getX() + dist, getY());
    }

    /**
     * Put out a puff of smoke (only on every second call).
     */
    private void makeSmoke()
    {
        count--;
        if (count == 0) {
            getWorld().addObject ( new Smoke(), getX(), getY());
            count = 2;
        }
    }

    /**
     * Release the ball from the paddle.
     */
    public void release()
    {
        deltaX = Greenfoot.getRandomNumber(11) - 5;
        deltaY = -5;
        stuck = false;
    }
}
