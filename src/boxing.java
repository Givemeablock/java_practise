import java.util.HashMap;
import java.util.Map;

public class boxing {

    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put("one", 1);
        int temp = (Integer)m1.get("one");
        System.out.println("+++++++++");
    }
}
