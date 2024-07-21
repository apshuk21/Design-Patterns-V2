package introToThreads.addersubtractorsynchronized;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {

    private Value v;

    public Adder(Value v) {
        this.v = v;
    }

    @Override
    public Void call() {
        for (int i = 1; i < 5000; i++) {
            synchronized (v) {
                int value = v.getV() + 1;
                v.setV(value);
            }
        }
        System.out.println("Adder Value is: " + v.getV());
        return null;
    }
}
