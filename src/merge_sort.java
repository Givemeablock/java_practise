import java.util.ArrayList;
import java.util.Scanner;

public class merge_sort {
    /**
    * @param: A
    * @param: length
    * */
    public static ArrayList<Integer> Merge_sort(ArrayList<Integer> A, int length) {
        if (length <= 1){
            return A;
        }
        int mid = length / 2;
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
        for (int i = 0; i < mid ; i ++ ) {
            left.add(A.get(i));
        }
        for (int i = mid; i < length; i ++) {
            right.add(A.get(i));
        }
        left = Merge_sort(left, left.size());
        right = Merge_sort(right, right.size());
        ArrayList<Integer> res = new ArrayList<Integer>();
        int i = 0, j = 0;
        while (i < left.size() && j < right.size()) {
            if ( left.get(i) < right.get(j) ) {
                res.add(left.get(i));
                i += 1;
            }
            else {
                res.add(right.get(j));
                j += 1;
            }
        }
        while ( i < left.size() ) {
            res.add( left.get(i) );
            i += 1;
        }
        while ( j < right.size() ) {
            res.add( right.get(j) );
            j += 1;
        }
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
        input_list = Merge_sort(input_list, input_list.size());
        System.out.println(input_list);
    }
}
