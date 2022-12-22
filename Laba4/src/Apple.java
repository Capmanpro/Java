public class Apple implements Priceable {
    String color;
    int price;
    String sort;
    public Apple(String Color, int Price, String Sort)
    {
        this.color = Color;
        this.price = Price;
        this.sort = Sort;
    }
    public String getColor()
    {
        return color;
    }
    public String getSort()
    {
        return sort;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
