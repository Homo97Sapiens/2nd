package work;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ReflectionDemo
{
    // TASK 1
    public static int human_quant(List list)
    {
        int quant = 0;

        Iterator iter = list.iterator();
        while (iter.hasNext())
        {
            if (iter.next() instanceof Human) {
                quant++;
            }
        }

        return quant;
    }

    public static boolean is_human(Class obj_class)
    {
        if (obj_class.equals(Human.class))
        {
            return true;
        }
        Class super_class = obj_class.getSuperclass();
        while (super_class != null)
        {
            if (super_class.equals(Human.class))
            {
                return true;
            }
            super_class = super_class.getSuperclass();
        }

        return false;
    }


    // TASK 2
    public static List<String> get_public_methods(Object obj)
    {
        List<String> list = new ArrayList<>();

        Class this_class = obj.getClass();
        Method[] metarr = this_class.getMethods();
        for (int i = 0; i < metarr.length; i++)
        {
            list.add(metarr[i].getName());
        }
        return list;
    }


    // TASK 3
    public static List<String> getSuperclass_list(Object object)
    {
        List<String> list = new ArrayList<>();
        Class this_class = object.getClass();
        Class super_class = this_class.getSuperclass();
        while (super_class != null)
        {
            list.add(super_class.toString());
            super_class = super_class.getSuperclass();
        }

        return list;
    }


    // test purposes
    public static void printClass(Object object)
    {
        System.out.printf("Type: %s\n", object.getClass());
    }


    public static int executeList(List<Object> list)
    {
        Iterator<Object> iter = list.iterator();
        int quant = 0;

        while (iter.hasNext())
        {
            Object tmp = iter.next();
            Class curr = tmp.getClass();
            Method[] metarr = curr.getDeclaredMethods();
            for (int i = 0; i < metarr.length; i++)
            {
                if (metarr[i].getName() == "void execute()")
                {
                    try {
                        metarr[i].invoke(tmp);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                    quant++;
                    break;
                }
            }
        }

        return quant;
    }
}
