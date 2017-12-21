import java.util.ArrayList;
import java.util.Scanner;

public class quick_sort {
    /**
     * @param A
     * @param length
     * */
    public static ArrayList<Integer> Quick_sort(ArrayList<Integer> A, int length) {
        if ( length <= 1) {
            return A;
        }
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        int key = A.get(0);
        int i = 1;
        while (i < length) {
            if ( A.get(i) < key ) {
                left.add(A.get(i));
            }
            else {
                right.add(A.get(i));
            }
            i += 1;
        }
        ArrayList<Integer> res = new ArrayList<>();
        left = Quick_sort(left, left.size());

        right = Quick_sort(right, right.size());
        res.addAll(left);
        res.add(key);
        res.addAll(right);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> input_list = new ArrayList<Integer>();
        while(true){
            try {
                input_list.add(sc.nextInt());
            }
            catch (Exception e){
                break;
            }
        }
        System.out.println(input_list);
        //System.out.println(input_list.size());
        input_list = Quick_sort(input_list, input_list.size());
        System.out.println(input_list);
    }
}
