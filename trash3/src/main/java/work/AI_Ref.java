package work;

import java.lang.Class;
import java.util.List;

public class AI_Ref
{
    public static void main(String[] args)
    {
        Human me = new Human("Ivan", 21);
        Student me2 = new Student("Ivan", 21, "OmSU");

        ReflectionDemo.printClass(me);
        me.printHuman();

        Class human = Human.class;
        human.getSuperclass();

        List<String> list = ReflectionDemo.getSuperclass_list(me2);
        System.out.printf("%s\n", list.toString());

        list = ReflectionDemo.get_public_methods(me);
        System.out.printf("%s\n", list.toString());
    }
}
