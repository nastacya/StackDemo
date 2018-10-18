import java.util.NoSuchElementException;


public class QueueDemo {
    private Integer[] array;
    private int size = 0;
    private int head = 0;
    private int tail = 0;

    public QueueDemo(int capacity) {
        array = new Integer[capacity];
    }

    public void enqueue(Integer item) {
        if (size == array.length) {
            throw new IllegalStateException("Sorry, can not add to full queue");
        }
        array[tail] = item;
        tail = (tail + 1) % array.length;
        size++;
    }

    public Integer dequeue() {
        if (size == 0) {
            throw new NoSuchElementException("Sorry, can not remove from empty queue!");
        }
        Integer item = array[head];
        array[head] = null;
        head = (head + 1) % array.length;
        size--;
        return item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}