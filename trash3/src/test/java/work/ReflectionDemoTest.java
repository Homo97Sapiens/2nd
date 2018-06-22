package work;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
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
    public void is_human() {
    }

    @Test
    public void get_public_methods() {
    }

    @Test
    public void getSuperclass_list() {
    }
}