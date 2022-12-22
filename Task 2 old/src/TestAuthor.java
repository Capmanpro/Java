public class TestAuthor {
    public static void main (String[] ags)
    {
        Author author1 = new Author("Alex","emailAlex@mail.ru",'m');
        Author author2 = new Author("Alice","emailAlice@mail.ru",'f');
        System.out.println(author1);
        author1.setEmail("emailNewAlex@mail.ru");
        System.out.println(author1);
        System.out.println(author2);
    }
}
