package introToThreads.AdderSubtractor;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {

    private Value v;

    public Subtractor(Value v) {
        this.v = v;
    }

    @Override
    public Void call() throws Exception {
        for (int i = 1; i < 5000; i++) {
            int value = v.getV() - 1;
            v.setV(value);
        }
        System.out.println("Subtractor Value is: " + v.getV());
        return null;
    }
}
