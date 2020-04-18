public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(1);
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);
        myLinkedList.add(2, 7);
        myLinkedList.printList();

    }
}
