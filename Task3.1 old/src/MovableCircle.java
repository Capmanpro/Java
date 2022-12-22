public class MovableCircle extends MovablePoint implements Movable {
    private int radius;
    private MovablePoint center = new MovablePoint(x,y,xSpeed,ySpeed);
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    public String toString()
    {
        return ("x: " + x + " y: " + y);
    }

    @Override
    public void moveUp() {
        super.moveUp();
    }

    @Override
    public void moveDown() {
        super.moveDown();
    }

    @Override
    public void moveRight() {
        super.moveRight();
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
    }
}
