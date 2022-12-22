public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Alice", "Mike");
        Dog dog2 = new Dog("Rex", "Amy");
        dog1.output();
        dog2.output();
        Ball ball1 = new Ball(9,"Red");
        Ball ball2 = new Ball(3,"Green");
        ball1.vol();
        ball2.vol();
        Book book1 = new Book("War and Peace", 1274);
        Book book2 = new Book("1984", 352);
        book1.read();
        book2.read();
    }
}
