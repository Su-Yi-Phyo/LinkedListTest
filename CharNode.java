public class CharNode {
    private char data;
    private CharNode next;

    public CharNode(char data, CharNode next) {
        this.data = data;
        this.next = next;
    }

    public char getData() {
        return data;
    }

    public CharNode getNext() {
        return next;
    }

    public void setNext(CharNode next) {
        this.next = next;
    }

    public void setData(char value) {
        this.data = value;
    }

}
