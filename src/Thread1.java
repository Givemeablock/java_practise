public class Thread1 {
    public static void main(String[] args) {
        Runner1 r1 = new Runner1();

        Thread t1 = new Thread(r1);
        t1.start();

        for ( int i = 0; i < 100; i ++ ) {
            //for ( int j = 0; j < 1000000000; j++ ){}
            System.out.println( "Main_thread:" + i );
        }
    }


}
class Runner1 implements Runnable {
    @Override
    public void run() {
        for ( int i = 0; i < 100; i++ ) {
            //for ( int j = 0; j < 1000000000; j++ ){}
            System.out.println( "Runner1:" + i );
        }
    }
}