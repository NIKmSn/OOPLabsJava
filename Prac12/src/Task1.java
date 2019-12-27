class Person
{
    private String fullName;
    public Person()
    {
        fullName = "";
    }
    public Person(String fullName)
    {
        this.fullName = fullName;
    }
    public String getFullName()
    {
        if (fullName != "")
        {
            return fullName;
        }
        else return "Name is not set";
    }
}
public class Task1 {
    public static void main(String[] args)
    {
        Person person1 = new Person("Ivan Ivanov");
        Person person2 = new Person();
        System.out.println(person1.getFullName());
        System.out.println(person2.getFullName());
    }
}
