public class Test_DeadLock implements Runnable {
    int flag;
    static Object o1 = new Object();//只会初始化一次，只存在一个o1,不管多少个对象，属于类
    static Object o2 = new Object();
    @Override
    public void run() {
        System.out.println(flag);
        if ( flag == 0 ) {
            synchronized (o1) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }
                synchronized (o2) {
                    System.out.println(flag + ":" + flag );
                }
            }

        }
        if ( flag == 1 ) {
            synchronized (o2) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }
                synchronized (o1) {
                    System.out.println(flag + ":" + flag );
                }
            }

        }
    }

    public static void main( String[] args ) {
       Test_DeadLock r1 = new Test_DeadLock();
       Thread t1 = new Thread(r1);
       r1.flag = 0;
       Test_DeadLock r2 = new Test_DeadLock();
       Thread t2 = new Thread(r2);
       r2.flag = 1;
       t1.start();
       t2.start();

    }
}
