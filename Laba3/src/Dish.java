    public abstract class Dish
    {
        private String material;
        private String color;
        public Dish(String Material, String Color) {
            this.material = Material;
            this.color = Color;
        }
        public String getColor() {
            return this.color;
        }
        public String getMaterial() {
            return this.material;
        }
        public void output() {
            System.out.println("Material: " + material + " Color: " + color);
        }
    }