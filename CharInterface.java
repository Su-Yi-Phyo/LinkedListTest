public interface CharInterface {
    public CharNode getHead();

    public void addFirst(char data);

    public boolean addAfterFirstKey(char data, char key);

    public int largestCharPosition();

    public int removeKey(char key);

    public void addAfterFirstVowel(char value);

    public void addAfterFirstConsonant(char value);

    public char removeFirstVowel();

    public char removeFirstConsonant();

    public int countVowel();

    public int countConsonant();

    public int countUpperCase();

    public int countLowerCase();

    public int countUpperCaseConsonant();

    public int countUpperCaseVowel();

    public void checkSorted();
}
