public class TestCircle {
    public static void main(String[] arg){
        Circle circle1 = new Circle(5,"Red");
       System.out.println(circle1);
        circle1.squar();
        circle1.setColor("Blue");
        circle1.setRadius(8.2);
        System.out.println(circle1);
        circle1.squar();
    }
}
