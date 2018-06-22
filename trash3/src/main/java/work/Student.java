package work;

public class Student extends Human implements Executable
{
    public String uni;

    public Student(String _name, int _age, String _uni)
    {
        super(_name, _age);
        uni = _uni;
    }

    public void execute()
    {
        System.out.println("STUDENT EXECUTED x_x");
    }
}
