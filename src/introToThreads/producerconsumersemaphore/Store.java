package introToThreads.producerconsumersemaphore;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {
    private int maxSize;

    private ConcurrentLinkedQueue<Object> items;

    public Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ConcurrentLinkedQueue<Object>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public ConcurrentLinkedQueue<Object> getItems() {
        return items;
    }

    public void addItem() {
        System.out.println("Producer production time, current size " + this.items.size());
        this.items.add(new Object());
    }

    public void removeItem() {
        System.out.println("Consumer consuming time, current size " + this.items.size());
        this.items.remove();
    }
}
