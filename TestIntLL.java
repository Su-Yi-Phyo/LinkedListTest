public class TestIntLL {
    public static void main(String[] args) {
        IntLinkedList list = new IntLinkedList();
        list.addFirst(2);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(6);

        list.print();

        // .addAfter(list.getHead(), 6);
        // list.print();

        // list.addLast(9);
        // list.addAfterFirstEven(3);
        // list.addAfterFirstOdd(6);
        // boolean result = list.addAtPosition(3, 5);
        // if (result) {
        // list.print();
        // }
        // list.addAfterAllEven(8);
        // list.print();

        // list.removeFirst();
        // list.removeLast();
        // list.removeAfter(list.getHead().getNext());
        // list.removeAfterAllEven();
        // list.removeAfterFirstEven();
        // list.removeDuplicates();
        // list.removeAtPosition(3);
        // int count = list.countPrime();
        // System.out.println(count);
        // list.removeCurr(list.getHead().getNext());
        // list.print();
        // int max = list.findMax();
        // System.out.println(max);
        // list.reverseList();
        // list.sortList();
        // list.print();
        // list.removeDuplicates();
        // list.print();
        // boolean result = list.removeAt(3);
        // System.out.println(result);
        // System.out.println(list.searchKey(5));
        // list.print();
        // System.out.println(list.checkSorted());

        // list.remove(4);
        // list.print();
        System.out.println(list.countOdd());
        System.out.println(list.sumEven());
    }

}
