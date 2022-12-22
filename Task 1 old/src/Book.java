public class Book {
    public String name;
    public int pages;
    public Book(String Name, int Pages)
    {
        name = Name;
        pages = Pages;
    }
    public void read()
    {
        System.out.println("You will read all " + pages + " pages in " + name + " an average of " + pages*1.5 + " minutes");
    }
}

