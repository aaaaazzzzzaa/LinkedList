import main.java.MyQueue;

public class MyQueueMain {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        Integer dequeueItem = queue.dequeue();
        System.out.println("dequeueItem = " + dequeueItem);

        Integer peakItem = queue.peak();
        System.out.println("peakItem = " + peakItem);

        queue.dequeue();
        queue.dequeue();
    }
}
