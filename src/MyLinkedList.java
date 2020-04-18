public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList(){}

    public void addFirst(E element){
        Node temp = this.head;
        this.head = new Node(element);
        this.head.next = temp;
        this.numNodes++;
    }

    public void addLast(E element){
        Node temp = this.head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(element);
    }

    public void add(int index, E element){
        if(index == 0) {
            addFirst(element);
        } else if(index == numNodes){
            addLast(element);
        } else {
            Node current = head;
            Node newNode = new Node(element);
            for (int i = 1; i < index; i++){
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            numNodes++;
        }
    }

    public int size() {
        return this.numNodes;
    }

    public E remove(int index) {
        if (index == 0) {
            removeFirst();
        } else if (index == numNodes) {
            removeLast();
        } else {
            Node current = head;
            for (int indexNode = 1; indexNode < index; indexNode++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
    }

    public void removeFirst() {
        head = head.next;
    }

    public void removeLast() {
        Node current = head;
        for (int indexNode = 1; indexNode < numNodes - 1; indexNode++) {
            current = current.next;
        }
        current.next = null;
    }

    public boolean removeObject(Object data) {
        if (indexOf(data) != -1) {
            remove(indexOf(data));
            return true;
        }
        return false;
    }

    public int indexOf(Object data) {
        Node current = head;
        for (int index = 0; index < numNodes; index++) {
            if (current.getData() == data) {
                return index;
            }
            current = current.next;
        }
        return -1;
    }

    public Node get(int index) {
        Node current = head;
        for (int indexNode = 0; indexNode < index; indexNode++) {
            current = current.next;
        }
        return current;
    }

    public Object clone() {
        MyLinkedList cloneList = new MyLinkedList();
        cloneList.head = head;
        cloneList.numNodes += 2;
        for (int index = 1; index < numNodes - 1; index++) {
            cloneList.addLast(get(index).getData());
        }
        return cloneList;
    }

    public void printList(){
        Node current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

}
