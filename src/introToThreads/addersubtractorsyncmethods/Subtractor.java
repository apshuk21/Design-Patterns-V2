package introToThreads.addersubtractorsyncmethods;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {

    private Value v;

    public Subtractor(Value v) {
        this.v = v;
    }

    public Void call() throws Exception {
        for (int i = 1; i < 5000; i++) {
            System.out.println("Subtractor in the thread: " + Thread.currentThread().getName());
            v.decrementBy(1);
        }
        System.out.println("Subtractor Value is: " + v.getV());
        return null;
    }
}
