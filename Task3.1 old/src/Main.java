public class Main {
    public static void main (String[] args)
    {
        MovableCircle movableCircle = new MovableCircle(0,0,1,1,1);
        System.out.println(movableCircle);
        movableCircle.moveUp();
        movableCircle.moveRight();
        System.out.println(movableCircle);
        movableCircle.moveDown();
        movableCircle.moveLeft();
        System.out.println(movableCircle);

        MovableRectangle movableRectangle = new MovableRectangle(0,0,1,1,1,1);
        System.out.println(movableRectangle);
        movableRectangle.moveUp();
        movableRectangle.moveRight();
        System.out.println(movableRectangle);
        movableRectangle.moveLeft();
        movableRectangle.moveDown();
        System.out.println(movableRectangle);
    }
}
