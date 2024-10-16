public class IntLinkedList implements ListInterface {
    Node head = null;
    int num_nodes = 0;

    public IntLinkedList() {

    }

    public Node getHead() {
        return head;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + "->");
            temp = temp.getNext();
        }

        System.out.println();
    }

    public void addFirst(int item) {
        head = new Node(item, head);
        num_nodes++;
    }

    public void addAfter(Node cur, int item) {
        if (head == null) {
            addFirst(item);
        }
        Node temp = head;
        while (temp.getNext() != null && temp.getNext() != cur) {
            temp = temp.getNext();
        }
        Node newNode = new Node(item, cur.getNext());
        cur.setNext(newNode);
        num_nodes++;
    }

    public void addLast(int item) {
        if (head == null) {
            addFirst(item);
        }

        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        Node newNode = new Node(item);
        temp.setNext(newNode);
        num_nodes++;
    }

    public void addAfterFirstEven(int item) {
        if (head == null || head.getData() % 2 == 0) {
            addFirst(item);
        }
        Node temp = head;
        while (temp.getNext() != null) {
            if (temp.getData() % 2 == 0) {
                break;
            }

            temp = temp.getNext();
        }

        Node newNode = new Node(item, temp.getNext());
        temp.setNext(newNode);
        num_nodes++;
    }

    public void addAfterFirstOdd(int item) {
        if (head == null || head.getData() % 2 != 0) {
            addFirst(item);
        }
        Node temp = head;
        while (temp.getNext() != null) {
            if (temp.getData() % 2 != 0) {
                break;
            }

            temp = temp.getNext();
        }

        Node newNode = new Node(item, temp.getNext());
        temp.setNext(newNode);
        num_nodes++;
    }

    public boolean addAtPosition(int k, int item) {
        if (head == null || k == 1) {
            addFirst(item);
            return true;
        }

        Node temp = head;
        int position = 1;

        while (temp.getNext() != null && position < k - 1) {
            temp = temp.getNext();
            position++;
        }

        if (position != k - 1) {
            return false;
        }

        Node newNode = new Node(item, temp.getNext());
        temp.setNext(newNode);
        num_nodes++;
        return true;
    }

    public void addAfterAllEven(int item) {
        if (head == null) {
            addFirst(item);
        }

        Node temp = head;
        while (temp.getNext() != null) {
            if (temp.getData() % 2 == 0) {
                Node newNode = new Node(item, temp.getNext());
                temp.setNext(newNode);
                temp = temp.getNext();
                num_nodes++;
            }
            temp = temp.getNext();
        }
    }

    public int removeFirst() {
        head = head.getNext();
        num_nodes--;
        return head.getData();
    }

    public int removeLast() {
        if (head == null) {
            removeFirst();
        }
        Node temp = head;
        while (temp.getNext().getNext() != null) {
            temp = temp.getNext();
        }
        Node newNode = temp;
        temp = temp.getNext();
        newNode.setNext(temp.getNext());
        num_nodes--;
        return temp.getData();
    }

    public int removeAfter(Node cur) {
        if (head == cur) {
            removeFirst();
        }
        Node temp = head;
        while (temp.getNext() != null && temp.getNext() != cur) {
            temp = temp.getNext();
        }
        temp = cur.getNext();
        cur.setNext(temp.getNext());
        num_nodes--;
        return 0;
    }

    public void removeAfterAllEven() {
        if (head.getData() % 2 == 0) {
            removeFirst();
        }
        Node temp = head;
        while (temp.getNext() != null) {
            if (temp.getData() % 2 == 0) {
                Node newNode = temp;
                temp = temp.getNext();
                newNode.setNext(temp.getNext());
            }
            temp = temp.getNext();
        }
    }

    public int removeAfterFirstEven() {
        Node temp = head;
        while (temp.getNext() != null) {
            if (temp.getData() % 2 == 0) {
                break;
            }

            temp = temp.getNext();
        }
        Node newNode = temp;
        temp = temp.getNext();
        newNode.setNext(temp.getNext());
        num_nodes--;
        return temp.getData();
    }

    public int removeAfterFirstPrime() {
        Node temp = head;
        while (temp.getNext() != null) {
            if (temp.getData() == 2) {
                break;
            } else {
                for (int i = 3; i < num_nodes; i++) {

                }
            }
            temp = temp.getNext();
        }
        Node newNode = temp;
        temp = temp.getNext();
        newNode.setNext(temp.getNext());
        num_nodes--;
        return temp.getData();
    }

    public void removeDuplicates() {
        sortList();
        Node temp = head;
        while (temp != null) {
            if (temp.getData() == temp.getNext().getData()) {
                Node newnNode = temp;
                temp = temp.getNext();
                newnNode.setNext(temp.getNext());
            }

            temp = temp.getNext();
        }
    }

    public int removeAtPosition(int k) {
        int position = 1;
        if (head == null || k == position) {
            removeFirst();
        }
        Node temp = head;
        while (temp.getNext() != null && position < k - 1) {
            temp = temp.getNext();
            position++;
        }
        Node newnNode = temp;
        temp = temp.getNext();
        newnNode.setNext(temp.getNext());
        return 0;
    }

    public int removeCurr(Node cur) {
        if (head == null || head == cur) {
            removeFirst();
        }
        Node temp = head;
        while (temp.getNext() != null && temp.getNext() != cur) {
            temp = temp.getNext();
        }
        Node newNode = temp;
        temp = temp.getNext();
        newNode.setNext(temp.getNext());
        return 0;

    }

    public int remove(int item) {
        if (head.getData() == item) {
            removeFirst();
        }

        Node temp = head;
        while (temp.getNext() != null && temp.getNext().getData() != item) {
            temp = temp.getNext();
        }
        Node newNode = temp;
        temp = temp.getNext();
        newNode.setNext(temp.getNext());
        return temp.getData();
    }

    public int countEven() {
        int count = 0;
        if (head.getData() % 2 == 0) {
            count += 1;
        }
        Node temp = head;
        while (temp.getNext() != null) {
            if (temp.getData() % 2 == 0) {
                count++;
            }
            temp = temp.getNext();
        }
        return count;
    }

    public int countPrime() {
        int count = 0;
        boolean isPrime = false;
        Node temp = head;
        while (temp != null) {
            int n = temp.getData();

            if (n <= 0) {
                isPrime = false;
            } else if (n == 2) {
                isPrime = true;
            } else {

                for (int i = 3; i < Math.sqrt(n); i += 2) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                count++;
            }
            temp = temp.getNext();

        }
        return count;
    }

    public int countOdd() {
        int count = 0;
        if (head.getData() % 2 != 0) {
            count++;
        }
        Node temp = head;
        while (temp.getNext() != null) {
            if (temp.getData() % 2 != 0) {
                count++;
            }
            temp = temp.getNext();
        }
        return count;
    }

    public int sumEven() {
        int sum = 0;

        Node temp = head;
        while (temp != null) {
            if (temp.getData() % 2 == 0) {
                sum += temp.getData();
            }
            temp = temp.getNext();
        }
        return sum;
    }

    public int sumOdd() {
        int sum = 0;
        return sum;
    }

    public int sumPrime() {
        int sum = 0;
        return sum;
    }

    public int findMax() {
        int max = head.getData();
        Node temp = head;
        while (temp.getNext() != null) {
            if (temp.getData() > max) {
                max = temp.getData();
            }
            temp = temp.getNext();
        }
        return max;
    }

    public void reverseList() {
        Node cur = head;
        Node prev = null;
        Node next = null;
        while (cur != null) {
            next = cur.getNext();
            cur.setNext(prev);
            prev = cur;
            cur = next;
        }
        head = prev;

    }

    public void sortList() {
        Node temp = head;

        while (temp != null) {
            Node newNode = temp.getNext();
            Node mini = temp;

            while (newNode != null) {
                if (newNode.getData() < mini.getData()) {
                    mini = newNode;
                }
                newNode = newNode.getNext();
            }

            int num = temp.getData();
            temp.setData(mini.getData());
            mini.setData(num);

            temp = temp.getNext();
        }
    }

    public boolean removeAt(int position) {
        if (position > num_nodes) {
            return false;
        }

        int key = 1;
        if (head == null || position == key) {
            head = head.getNext();
            num_nodes--;
        }

        Node temp = head;
        while (temp.getNext() != null && key < position - 1) {
            temp = temp.getNext();
            key++;
        }

        Node newNode = temp;
        temp = temp.getNext();
        newNode.setNext(temp.getNext());

        return true;
    }

    public int searchKey(int key) {
        int position = 1;
        Node temp = head;
        while (temp != null) {
            if (temp.getData() == key) {
                return position;
            }

            temp = temp.getNext();
            position++;
        }

        return -1;
    }

    public boolean checkSorted() {
        boolean descSorted = true;
        boolean ascSorted = true;
        Node temp = head;
        while (temp.getNext() != null) {
            if (temp.getData() > temp.getNext().getData()) {
                ascSorted = false;
                break;
            }
            temp = temp.getNext();
            // ascSorted = false;
        }

        Node newNode = head;
        while (newNode.getNext() != null) {
            if (newNode.getData() < newNode.getNext().getData()) {
                descSorted = false;
                break;
            }
            newNode = newNode.getNext();
            // descSorted = false;
        }
        return ascSorted || descSorted;
    }

}
