import main.java.MyLinkedList;

public class MyLinkedMain {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);

        System.out.println("myLinkedList = " + myLinkedList.get(0));
        System.out.println("myLinkedList = " + myLinkedList.get(1));
        myLinkedList.delete(0);
        System.out.println("myLinkedList = " + myLinkedList.get(0));

        myLinkedList.add(1);
        for (Integer item: myLinkedList) {
            System.out.println("item = " + item);
        }

    }
}