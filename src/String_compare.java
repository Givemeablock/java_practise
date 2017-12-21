import java.util.*;
import java.util.stream.Collector;

public class String_compare {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String a = console.next();
        String b = console.next();
        ArrayList<String> list = new ArrayList<String>();
        list.add(a);
        list.add(b);
        System.out.println(String.format("%s compare to %s", a, b));
        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        Collections.sort(list, c);
        System.out.println(list);

    }
}
