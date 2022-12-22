public class Ball {
    private double x = 0.0;
    private double y = 0.0;
    public Ball(double X, double Y)
    {
        x = X;
        y = Y;
    }
    public Ball() {}
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public void setXYSpeed(double XSpeed, double YSpeed)
    {
        if (XSpeed == 0 || YSpeed == 0)
        {
            System.out.println("Мяч не двигается!");
            return;
        }
        double xSpeed = XSpeed;
        double ySpeed = YSpeed;

    }
    public void move(double xDisp, double yDisp)
    {
        this.x = x + xDisp;
        this.y = y + yDisp;
    }
    public String toString()
    {
        String str = ("x: " + x + " y: " + y);
        return str;
    }
}
