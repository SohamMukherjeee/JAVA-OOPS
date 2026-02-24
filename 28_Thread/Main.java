
class ThreadSample implements Runnable {

    @Override
    public void run() {
        try {
            running();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void running() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ThreadSample threadSample = new ThreadSample();
        Thread thread1 = new Thread(threadSample);
        Thread thread2 = new Thread(threadSample);

        thread1.start();
        thread2.start();
    }
}
