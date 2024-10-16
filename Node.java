public class Node {
    private int data;
    private Node next;

    public Node(int item, Node n) {
        this.data = item;
        this.next = n;
    }

    public Node(Node n) {
        this.next = n;
    }

    public Node(int item) {
        this.data = item;
    }

    public void setNext(Node n) {
        next = n;
    }

    public void setData(int item) {
        data = item;
    }

    public Node getNext() {
        return next;
    }

    public int getData() {
        return data;
    }
}
