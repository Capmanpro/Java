public class Square extends Rectangle {
    public Square(){}
    protected double side;
    public Square(double side){
        this.side = side;
    }
    public Square(double side, String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public void setWigth(double side)
    {
        this.width = side;
    }
    public void setLength(double side)
    {
        this.length = side;
    }

    @Override
    public String toString() {
        return ("Square's output");
    }
}
