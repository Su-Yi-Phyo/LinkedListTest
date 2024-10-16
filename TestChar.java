public class TestChar {
    public static void main(String[] args) {
        CharLinkedList list = new CharLinkedList();
        list.addFirst('c');
        list.addFirst('e');
        list.addFirst('d');
        list.addFirst('A');
        list.addFirst('k');
        // list.print();
        // list.addAfterFirstKey('E', 'e');
        // list.print();
        // System.out.println(list.largestCharPosition());
        // list.removeKey('t');
        // System.out.println(list.removeKey('t'));
        // list.print();
        // list.addAfterFirstConsonant('t');
        // list.removeFirstVowel();
        // list.removeFirstConsonant();
        // list.countVowel();
        // System.out.println(list.countUpperCaseVowel());
        list.addFirst('e');
        list.print();
        list.removeDuplicates();
        list.print();
    }

}
