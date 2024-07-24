import main.java.MyStack;

public class MyStackMain {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        Integer popItem = stack.pop();
        System.out.println("popItem = " + popItem);

        Integer peakItem = stack.peak();
        System.out.println("peakItem = " + peakItem);
    }
}
