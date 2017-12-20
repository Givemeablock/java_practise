public class t1 {
    /**
     *
     * @param index
     * @param obj
     */
    public static void print(int index, Object obj){
        System.out.println(String.format("%d, %s", index, obj.toString()));

    }

    public static void demoprint(){
        print(1, 5&4);

    }

    public static boolean try__(){
        try{
            int a = 8 / 0;
        }
        catch (Exception e){
            System.out.println("in catch before");
            return true;
            //System.out.println("in catch after");
        }
        finally {
            System.out.print("in finally");
            return false;
        }
    }

    public static void main(String[] args){
        print(888, new int[4]);
        demoprint();
        System.out.println(5%3);
        System.out.println(try__());
    }
}
