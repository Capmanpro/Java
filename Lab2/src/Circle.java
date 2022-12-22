public class Circle {
    public double radius;
    public String color;
    public Circle(double Radius, String Color)
    {
        radius = Radius;
        color = Color;
    }
    public String toString()
    {
        String str = (color + " circle with radius " + radius);
        return str;
    }
    public void squar()
    {
        System.out.println("Squar = " + 3.14*radius*radius);
    }
    public void setColor(String Color)
    {
        this.color = Color;
    }
    public void setRadius(double Radius)
    {
        this.radius = Radius;
    }

}
