package introToThreads.ProducerConsumer;

public class Producer implements Runnable {

    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (store) {
                if (this.store.getItems().size() < this.store.getMaxSize()) {
                    this.store.addItem();
                }
            }
        }
    }
}
