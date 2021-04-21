//Brieanna Betts
//1158732
package models;

public class AudioBook extends Book {
    private int lengthInSec;

    public AudioBook(String bookName, Person author, double price, int lengthInSec) {
        super(bookName, author, price);
    }

    public int getLengthInSec() {
        if (lengthInSec>=0) {
            return lengthInSec;
        }else
            throw new IllegalArgumentException("length must be more than 0 seconds");
    }

    public void setLengthInSec(int lengthInSec) {
    }
}
