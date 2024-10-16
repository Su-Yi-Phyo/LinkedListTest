public class CharLinkedList implements CharInterface {
    private CharNode head = null;
    private int num_nodes = 0;

    public CharLinkedList() {

    }

    public int size() {
        return num_nodes;
    }

    public CharNode getHead() {
        return head;
    }

    public void addFirst(char data) {
        head = new CharNode(data, head);
        num_nodes--;
    }

    public boolean addAfterFirstKey(char data, char key) {
        boolean check = false;
        CharNode temp = head;
        while (temp.getNext() != null) {
            if (temp.getData() == key) {
                CharNode newNode = new CharNode(data, temp.getNext());
                temp.setNext(newNode);
                check = true;
                break;
            }
            temp = temp.getNext();
        }
        return check;
    }

    public int largestCharPosition() {
        int position = 0;
        int largestposition = 0;
        char largest = head.getData();
        CharNode tmep = head;
        while (tmep != null) {
            if (tmep.getData() > largest) {
                largest = tmep.getData();
                largestposition = position;
            }
            tmep = tmep.getNext();
            position++;
        }
        return largestposition;
    }

    public void print() {
        CharNode temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + "->");
            temp = temp.getNext();
        }
        System.out.println("null");
    }

    public int removeKey(char key) {
        int position = 1;
        CharNode temp = head;
        boolean isFound = true;
        while (temp.getNext() != null && temp.getNext().getData() != key) {
            temp = temp.getNext();
            isFound = false;
            position++;
        }
        if (isFound) {
            CharNode newNode = temp;
            temp = temp.getNext();
            newNode.setNext(temp.getNext());
            return position;
        } else {
            return -1;
        }
    }

    public void addAfterFirstVowel(char value) {
        CharNode temp = head;
        while (temp != null) {
            if (temp.getData() == 'a' || temp.getData() == 'e' || temp.getData() == 'i' || temp.getData() == 'o'
                    || temp.getData() == 'u' ||
                    temp.getData() == 'A' || temp.getData() == 'E' || temp.getData() == 'I' || temp.getData() == 'O'
                    || temp.getData() == 'U') {
                CharNode newNode = new CharNode(value, temp.getNext());
                temp.setNext(newNode);
                break;
            }
            temp = temp.getNext();
        }
    }

    public void addAfterFirstConsonant(char value) {
        CharNode temp = head;
        while (temp != null) {
            if (temp.getData() != 'a' && temp.getData() != 'e' && temp.getData() != 'i' && temp.getData() != 'o'
                    && temp.getData() != 'u' &&
                    temp.getData() != 'A' && temp.getData() != 'E' && temp.getData() != 'I' && temp.getData() != 'O'
                    && temp.getData() != 'U') {
                CharNode newNode = new CharNode(value, temp.getNext());
                temp.setNext(newNode);
                break;
            }
            temp = temp.getNext();
        }
    }

    public char removeFirstVowel() {
        if ("AEIOUaeiou".indexOf(head.getData()) != -1) {
            head = head.getNext();
            return head.getData();
        }

        CharNode temp = head;
        while (temp.getNext() != null && !("AEIOUaeiou".indexOf(temp.getData()) != -1)) {
            temp = temp.getNext();
        }
        CharNode newNode = temp.getNext();
        temp.setNext(newNode.getNext());
        return temp.getData();
    }

    public char removeFirstConsonant() {
        if ("AEIOUaeiou".indexOf(head.getData()) == -1) {
            head = head.getNext();
            return head.getData();
        }
        CharNode temp = head;
        while (temp.getNext() != null && !("AEIOUaeiou".indexOf(temp.getData()) == -1)) {
            temp = temp.getNext();
        }
        CharNode newNode = temp.getNext();
        temp.setNext(newNode.getNext());
        return temp.getData();
    }

    public int countVowel() {
        int count = 0;
        if ("AEIOUaeiou".indexOf(head.getData()) != -1) {
            count++;
        }
        CharNode temp = head;
        while (temp.getNext() != null) {
            if (("AEIOUaeiou").indexOf(temp.getData()) != -1) {
                count++;
            }

            temp = temp.getNext();
        }
        return count;
    }

    public int countConsonant() {
        int count = 0;
        return count;
    }

    public int countUpperCase() {
        int count = 0;
        if (Character.isUpperCase(head.getData())) {
            count++;
        }
        CharNode temp = head;
        while (temp.getNext() != null) {
            if (Character.isUpperCase(temp.getData())) {
                count++;
            }

            temp = temp.getNext();
        }
        return count;
    }

    public int countLowerCase() {
        int count = 0;
        if (Character.isLowerCase(head.getData())) {
            count++;
        }
        CharNode temp = head;
        while (temp.getNext() != null) {
            if (Character.isLowerCase(temp.getData())) {
                count++;
            }

            temp = temp.getNext();
        }
        return count;
    }

    public int countUpperCaseConsonant() {
        int count = 0;
        if (Character.isUpperCase(head.getData()) && "AEIOUaeiou".indexOf(head.getData()) == -1) {
            count++;
        }
        CharNode temp = head;
        while (temp.getNext() != null && "AEIOUaeiou".indexOf(head.getData()) == -1) {
            if (Character.isUpperCase(temp.getData())) {
                count++;
            }

            temp = temp.getNext();
        }
        return count;
    }

    public int countUpperCaseVowel() {
        int count = 0;
        if (Character.isUpperCase(head.getData()) && "AEIOUaeiou".indexOf(head.getData()) != -1) {
            count++;
        }
        CharNode temp = head;
        while (temp.getNext() != null && "AEIOUaeiou".indexOf(head.getData()) != -1) {
            if (Character.isUpperCase(temp.getData())) {
                count++;
            }

            temp = temp.getNext();
        }
        return count;
    }

    public void checkSorted() {
        CharNode temp = head;

        while (temp != null) {
            CharNode newNode = temp.getNext();
            CharNode mini = temp;

            while (newNode != null) {
                if (newNode.getData() < mini.getData()) {
                    mini = newNode;
                }
                newNode = newNode.getNext();
            }

            char value = temp.getData();
            temp.setData(mini.getData());
            mini.setData(value);

            temp = temp.getNext();
        }
    }

    public void removeDuplicates() {
        checkSorted();
        CharNode temp = head;
        while (temp.getNext() != null) {
            if (temp.getData() == temp.getNext().getData()) {
                CharNode newNode = temp.getNext();
                temp.setNext(newNode.getNext());
            }
            temp = temp.getNext();
        }
    }
}
