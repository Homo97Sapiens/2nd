package work;

public class Student extends Human
{
    public String uni;

    public Student(String _name, int _age, String _uni)
    {
        super(_name, _age);
        uni = _uni;
    }
}
