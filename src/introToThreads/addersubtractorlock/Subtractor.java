package introToThreads.addersubtractorlock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {

    private Value v;
    private Lock lock;

    public Subtractor(Value v, Lock lock) {

        this.v = v;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        for (int i = 1; i < 5000; i++) {
            lock.lock();
            int value = v.getV() - 1;
            v.setV(value);
            lock.unlock();
        }
        System.out.println("Subtractor Value is: " + v.getV());
        return null;
    }
}
