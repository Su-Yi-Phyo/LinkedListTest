public interface ListInterface {
    public void addFirst(int item);

    public void addAfter(Node cur, int item);

    public void addLast(int item);

    public void addAfterFirstEven(int item);

    public void addAfterFirstOdd(int item);

    public boolean addAtPosition(int k, int item);

    public void addAfterAllEven(int item);

    public int removeFirst();

    public int removeLast();

    public int removeAfter(Node cur);

    public void removeAfterAllEven();

    public int removeAfterFirstEven();

    public int removeAfterFirstPrime();

    public void removeDuplicates();

    public int removeAtPosition(int k);

    // public int removeAfter(Node cur, int item);
    public int removeCurr(Node cur);

    public int remove(int item);

    public int countEven();

    public int countPrime();

    public int countOdd();

    public int sumEven();

    public int sumOdd();

    public int sumPrime();

    public int findMax();

    public void reverseList();

    public void sortList();

    public boolean removeAt(int position);

    public int searchKey(int key);

    public boolean checkSorted();
}