

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class my_collection {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Integer(100));
        c.add(new StringBuffer("hello world"));
        System.out.println(c);
        c = new LinkedList(c);
        System.out.println(c);
        ArrayList a = new ArrayList();
        a.add(new String("lol"));
        a.add(new Integer(10));
        System.out.println(a);

    }
}
