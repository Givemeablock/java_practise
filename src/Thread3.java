public class Thread3 {
    public static void main( String[] args ) {
        Runner r1 = new Runner();
        Thread t1 = new Thread(r1);
        t1.start();
        for ( int i = 0; i < 100; i ++ ) {
            System.out.println( i );
        }
        r1.ShutDown();
    }
}
//一个正确停止线程的例子
class Runner implements Runnable {

    private boolean flag = true;
    @Override
    public void run() {
        int i = 0;
        while (flag) {
            System.out.println( i ++ );
        }
    }
    public void ShutDown(){
        this.flag = false;
    }
}