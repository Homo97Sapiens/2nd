package work;

public class Human
{
    private String name;
    private int age;

    public Human(String _name, int _age)
    {
        name = _name;
        age = _age;
    }

    public void setAge(int _age)
    {
        age = _age;
    }

    public void setName(String _name)
    {
        name = _name;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void printHuman()
    {
        System.out.printf("Name: %s Age: %d\n", name, age);
    }
}
