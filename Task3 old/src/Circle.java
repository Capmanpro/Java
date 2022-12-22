public class Circle extends Shape {
    protected double radius;
    public Circle(){};
    public Circle(double Radius){
        this.radius = Radius;
    };
    public Circle(double Radius, String Color, boolean Filled){
        this.radius = Radius;
        this.color = Color;
        this.filled = Filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea()
    {
        return 3.14*radius*radius;
    }
    public double getPerimeter()
    {
        return 2*3.14*radius;
    }
    public String toString()
    {
        return ("Circle's output");
    }
}
