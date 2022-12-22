public class MovablePoint implements Movable {
    protected int x;
    protected  int x1;
    protected int y;
    protected int y1;
    protected int xSpeed;
    protected int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString()
    {
        return "x: " + x +" y: " + y;
    }

    @Override
    public void moveUp() {
        y+=1;
    }

    @Override
    public void moveDown() {
        y-=1;
    }

    @Override
    public void moveLeft() {
        x-=1;
    }

    @Override
    public void moveRight() {
        x+=1;
    }
}
