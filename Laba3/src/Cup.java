class Cup extends Dish
{
    private int volume;
    public Cup(String Material, String Color, int Volume)
    {
        super(Material, Color);
        this.volume = Volume;
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Dish type: Cup Volume: " + volume);
    }
}