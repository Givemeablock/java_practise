public class my_sych implements Runnable{
    Timer t1 = new Timer();
    @Override
    public void run() {
        t1.add(Thread.currentThread().getName());
    }

    public static void main ( String[] args ) {
        my_sych r1 = new my_sych();
        Thread m_t1 = new Thread(r1);
        Thread m_t2 = new Thread(r1);
        m_t1.setName("A");
        m_t2.setName("B");
        m_t1.start();
        m_t2.start();
    }
}
class Timer {
    private int num = 0;
    public synchronized void add(String s) {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println( s + "is " + num++);
    }
}