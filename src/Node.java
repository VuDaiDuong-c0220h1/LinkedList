public class Node {
    public Node next;
    public Object data;

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return this.data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
