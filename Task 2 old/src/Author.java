public class Author {
    public String name;
    public String email;
    public char gender;
    public Author(String Name, String Email, char Gender)
    {
        name = Name;
        email = Email;
        gender = Gender;
    };
    public String getName()
    {
        return name;
    };
    public String getEmail()
    {
        return email;
    };
    public void setEmail(String Email)
    {
        email = Email;
    };
    public char getGender()
    {
        return gender;
    };
    public String toString()
    {
        String str = ("Authors name: " + name + " Authors email: " + email + " Authors gender: " + gender);
        return str;
    };
}
