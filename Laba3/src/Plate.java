class Plate extends Dish
{
    private String size;
    public Plate(String Material, String Color, String Size)
    {
        super(Material, Color);
        this.size = Size;
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Dish type: Plate Size: " + size);
    }
}
