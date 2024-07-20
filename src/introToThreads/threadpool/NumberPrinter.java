package introToThreads.threadpool;

public class NumberPrinter implements Runnable {
    private int num;

    public NumberPrinter(int num) {
        this.num = num;
    }


    @Override
    public void run() {
        try {
            Thread.sleep(100);
            System.out.println(this.num + " " + Thread.currentThread().getName());
        } catch (InterruptedException e) {}

    }
}
