public class MathFunc implements MathCalculable{
    private double radius;

    public MathFunc() {}
    public MathFunc(double radius) {
        this.radius = radius;
    }

    public double getLength() {
        return (2*MathCalculable.pi*this.radius);
    }
    @Override
    public int getPower(int num, int pow) {
        return (int) Math.pow(num,pow);
    }

    @Override
    public double sqComplex(double re, double im) {
        double num=0;
        num = Math.sqrt(re*re + im*im);
        return num;
    }

    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();
        System.out.println("Число 5 в степени 3 = "+mc1.getPower(5,3));
        MathFunc a = new MathFunc(5);
        System.out.println("Длина окружности с радиусом 5 = "+a.getLength());
        MathFunc b = new MathFunc();
        System.out.println("Модуль комплексного числа 4+3i = "+b.sqComplex(4,3));
    }
}