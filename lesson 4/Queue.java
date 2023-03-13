package list_reverse;
import java.util.LinkedList;

public class Queue<T> {

    private LinkedList<T> list = new LinkedList<T>();

    public void enqueue(T item) {
        list.addLast(item);
    }

    public T dequeue() {
        return list.pollFirst();
    }

    public T first() {
        return list.peekFirst();
    }
}
