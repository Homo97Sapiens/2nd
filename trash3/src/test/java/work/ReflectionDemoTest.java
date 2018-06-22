package work;

import org.junit.Test;

import java.sql.Ref;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

public class ReflectionDemoTest {

    @Test
    public void human_quant() {
        Human human = new Human("aaa bb cccc", 22);
        Human human1 = new Human("bb cccc", 25);
        Student student = new Student("bb cccc", 25, "omsu");
        List<Object> list = new ArrayList<>();
        Collections.addAll(list, null, new Object(), new int[]{1,2,3}, student, human, "1234", human1);
        assertEquals(3, ReflectionDemo.human_quant(list));
    }

    @Test
    public void testGnS()
    {
        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "setName", "getName", "getAge", "setAge");
        List<String> list2 = ReflectionDemo.pullGnS(new Human("", 0));
        list1.sort(Comparator.naturalOrder());
        list2.sort(Comparator.naturalOrder());
        assertEquals(list1, list2);
    }
}