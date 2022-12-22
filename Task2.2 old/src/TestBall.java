public class TestBall {
    public static void main(String[] arg)
    {
        Ball ball1 = new Ball();
        System.out.println(ball1);
        ball1.setX(1);
        ball1.setY(1);
        System.out.println(ball1);
        ball1.setXY(2.1,3.5);
        System.out.println(ball1);
        ball1.setXYSpeed(0.0,1.0);
        ball1.setXYSpeed(1.0,1.0);
        ball1.move(1.0,1.0);
        System.out.println(ball1);
    };
}
