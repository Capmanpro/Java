public class Mass {
    double mass[] = new double[5];
    public Mass()
    {
        for (int i = 0; i <5; i++) {
            mass[i] = Math.random()*10;
        }
        for (int i = 0; i < 5; i++)
            System.out.println(mass[i]);
    }
   public void FOR()
    {
        double sum = 0;
        for(int i = 0; i <5; i++)
            sum = sum + mass[i];
        System.out.println(sum);
    }
    public void WHILE()
    {
        int i = 0;
        double sum = 0;
        while(i < 5)
        {
            sum = sum + mass[i];
            i++;
        }
        System.out.println(sum);
    }
    public void DOWHILE()
    {
        int i = 0;
        double sum = 0;
        do
        {
            sum = sum + mass[i];
            i++;
        }
        while(i < 5);
        System.out.println(sum);
    }
}
