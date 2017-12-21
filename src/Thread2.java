public class Thread2 {
    public static void main(String[] args) {
        m_thread t11 = new m_thread("ab");
        m_thread t22 = new m_thread("cb");
        t11.start();
        t22.start();
        m_thread1 t33 = new m_thread1("ef");
        m_thread1 t44 = new m_thread1("tt");
        t33.start();
        t44.start();
    }
}
//normal
class m_thread extends Thread {
    public m_thread(String s) {
        super(s);
    }
    @Override
    public void run() {
        for ( int i = 0; i < 100; i++ ) {
            System.out.println( this.getName() + ":" + i );
        }
    }
}
//yield
class m_thread1 extends Thread {
    public m_thread1(String s) {
        super(s);
    }
    @Override
    public void run() {
        for ( int i = 0; i < 100; i++ ) {
            System.out.println( this.getName() + ":" + i );
            if ( i % 10 == 0 ) {
                yield();
            }
        }
    }
}