package introToThreads.addersubtractorsyncmethods;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {

    private Value v;

    public Adder(Value v) {
        this.v = v;
    }

    @Override
    public Void call() {
        for (int i = 1; i < 5000; i++) {
            System.out.println("Adder in the thread: " + Thread.currentThread().getName());
            v.incrementBy(1);
        }

        System.out.println("Adder Value is: " + v.getV());
        return null;
    }
}
