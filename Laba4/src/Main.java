public class Main {
    public static void main (String[] args)
    {
        Cup cup = new Cup(250,"Glass",500);
        System.out.println("Cup's volume: " + cup.volume + " material: " + cup.material + " price: " + cup.getPrice());
        Apple apple = new Apple("Green", 20, "Sweet");
        System.out.println("Apple's color: " + apple.color + " sort: " + apple.sort + " price: " + apple.getPrice());
    }
}
