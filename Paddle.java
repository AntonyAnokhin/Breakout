import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The game paddle. It is keyboard controlled (left, right, space). It also 
 * generates a new ball when it is created itself.
 * 
 * @author mik
 * @version 1.0
 */
public class Paddle extends Actor
{
    public Ball myBall;  // used before ball gets released
    public boolean powerUpShootOne = false;
    public boolean powerUpShootTwo = false;
    private boolean spaceFlag = false;
    public boolean powerDownSmallPaddle = false;
    public boolean powerUpBigPaddle = false;
    private long currentTime = 0;
    private final int SPEED = 9;
    /**
     * When the paddle gets created, create a ball as well.
     */
    public void addedToWorld(World world)
    {
        newBall();
    }

    /**
     * Act - do whatever the Paddle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(powerDownSmallPaddle == true)
        {
            setImage("5.png");
        }
        else if(((Board) getWorld()).ball.sticky == true)
        {
            setImage("6.png");
        }
        else if(powerUpBigPaddle == true)
        {
            setImage("4.png");
        }
        else
        {
            setImage("paddle.png");
        }
        if (Greenfoot.isKeyDown ("left") || Greenfoot.isKeyDown("a")){
            move(-SPEED);
        }
        if (Greenfoot.isKeyDown ("right") || Greenfoot.isKeyDown("d")) {
            move(SPEED);
        }
        if (myBall != null && Greenfoot.isKeyDown ("space")) 
        {
            myBall.release();
            myBall = null;
        }
        long timer = ((Board) getWorld()).getTimer();
        if (powerUpShootOne && Greenfoot.isKeyDown("space") && !spaceFlag && timer - currentTime > 50)
        {
            currentTime = timer;
            spaceFlag = !spaceFlag;
            getWorld().addObject(new Bullet(),getX(), getY());
        }
        if (powerUpShootTwo && Greenfoot.isKeyDown("space") && !spaceFlag && timer - currentTime > 50)
        {
            currentTime = timer;
            spaceFlag = !spaceFlag;
            getWorld().addObject(new Bullet2(),getX() + 30, getY());
            getWorld().addObject(new Bullet2(),getX() - 30, getY());
        }
        if (!Greenfoot.isKeyDown("space"))
        {
            spaceFlag = false;
        }
    }

    public void move(int dist)
    {
        setLocation (getX() + dist, getY());
        if (myBall != null) {
            myBall.move (dist);
        }
    }

    public void newBall()
    {
        myBall = new Ball();
        Board board = ((Board) getWorld());
        board.ball = myBall;
        board.addObject (myBall, getX(), getY()-20);
    }


}
