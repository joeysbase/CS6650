public class TestMain{
    public static void main(String[] args){
        NamingThread name0 = new NamingThread("thread0");
        NamingThread name1 = new NamingThread("thread1");
        NamingThread name2 = new NamingThread("thread2");

        Thread t0 = new Thread(name0);
        Thread t1 = new Thread(name1);
        Thread t2 = new Thread(name2);

        // Start threads
        t0.start();
        t1.start();
        t2.start();

        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {}

        System.out.println(Thread.currentThread());
    }
}


class NamingThread implements Runnable {
    private String name;

    public NamingThread(String threadName) {
        System.out.println("Constructor called: " + threadName);
        name = threadName;
    }

    public void run() {
        System.out.println("Run called: " + name);
        System.out.println(name + ": " + Thread.currentThread());
    }
}
