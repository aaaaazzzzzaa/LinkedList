package main.java;

public class MyStack<T> {
    private final MyLinkedList<T> list = new MyLinkedList<>();

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        if (list.isEmpty()) {
            throw new IllegalStateException();
        }

        int lastIndex = list.size() - 1;
        T top = list.get(lastIndex);
        list.delete(lastIndex);
        return top;
    }

    public T peak() {
        if (list.isEmpty()) {
            throw new IllegalStateException();
        }

        int lastIndex = list.size() - 1;
        return list.get(lastIndex);
    }
}
