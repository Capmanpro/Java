public class Ball {
    public double radius;
    public String color;
    public Ball(double Radius, String Color)
    {
        radius = Radius;
        color = Color;
    }
    public void vol()
    {
        double a = 2*3.14*3*this.radius;
        System.out.println(color + " ball's volum is " + a);
    }
}
