package introToThreads;

public class NumberPrinter implements Runnable {
    private int num;

    public NumberPrinter(int num) {
        this.num = num;
    }


    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println(this.num + " " + Thread.currentThread().getName());
        } catch (InterruptedException e) {}

    }
}
