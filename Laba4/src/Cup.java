public class Cup implements Priceable{
    int volume;
    String material;
    int price;
    public Cup(int Volume, String Material, int Price)
    {
        this.volume = Volume;
        this.material = Material;
        this.price = Price;
    }
    public String getMaterial()
    {
        return material;
    }

    public int getVolume()
    {
        return volume;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
