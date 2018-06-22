package work;

import java.lang.Class;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AI_Ref
{
    public static void main(String[] args) {
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

        System.out.println("SOME MAGIC HERE");

        for (Method method : me.getClass().getDeclaredMethods())
        {
            System.out.println(method.getName());
        }

        List list1 = ReflectionDemo.pullGnS(me);
        System.out.println(list1.toString());

        List<Object> list2 = new ArrayList<>();
        Collections.addAll(list2, new Student("123", 123, "321"), null, "123", me, me2);

        System.out.println(ReflectionDemo.executeList(list2));
    }
}
