package main.java;

public class MyQueue<T> {
    private final MyLinkedList<T> list = new MyLinkedList<>();

    public void enqueue(T item) {
        list.add(item);
    }

    public T dequeue() {
        if (list.isEmpty()) {
            throw new IllegalStateException();
        }

        T frontItem = list.get(0);
        list.delete(0);
        return frontItem;
    }

    public T peak() {
        if (list.isEmpty()) {
            throw new IllegalStateException();
        }

        return list.get(0);
    }
}
