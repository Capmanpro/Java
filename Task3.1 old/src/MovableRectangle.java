public class MovableRectangle extends MovablePoint implements Movable {
    private MovablePoint topLeft = new MovablePoint(x,y,xSpeed,ySpeed);
    private MovablePoint bottomRight = new MovablePoint(x1,y1,xSpeed,ySpeed);
    public MovableRectangle(int x, int y, int x1, int y1, int xSpeed, int ySpeed)
    {
        super(x, y, xSpeed, ySpeed);
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.x1 =x1;
        this.y1 = y1;
    }

    @Override
    public void moveUp() {
        y1+=1;
        y+=1;
    }

    @Override
    public void moveDown() {
        y-=1;
        y1-=1;
    }

    @Override
    public void moveLeft() {
        x-=1;
        x1-=1;
    }

    @Override
    public void moveRight() {
        x+=1;
        x1+=1;
    }

    @Override
    public String toString() {
        return ("x: "+ x + " y: " + y + " x1: " + x1 + " y1: " + y1);
    }
}
