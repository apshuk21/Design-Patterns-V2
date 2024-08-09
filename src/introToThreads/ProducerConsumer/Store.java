package introToThreads.ProducerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private int maxSize;

    private List<Object> items = new ArrayList<>();

    public Store(int maxSize) {
       this.maxSize = maxSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public List<Object> getItems() {
        return items;
    }

    public void addItem() {
        this.items.add(new Object());
    }

    public void removeItem() {
        this.items.remove(this.items.size() - 1);
    }
}
