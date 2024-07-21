package introToThreads.addersubtractorsyncmethods;

public class Value {

    private int v;

    public Value(int v) {
        this.v = v;
    }

    public synchronized void incrementBy(int i) {
        this.v += 1;
    }

    public synchronized void decrementBy(int i) {
        this.v -= 1;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }
}
