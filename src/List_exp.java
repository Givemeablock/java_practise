import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;


public class List_exp {

    /*
    * @param: obj
    */

    public static void print(Object obj) {
        System.out.println(String.format("%s", obj.toString()));
    }

    public static void main(String[] args) {
        ArrayList<Goods> a = new ArrayList<Goods>();

        Goods yy = new Goods("yy", 100);
        a.add(yy);

        print(yy);


    }

    public static class Goods {

        private String name;
        private int price;
        Goods(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String toString(){
            return this.name + '-' + this.price;
        }

    }
}
