//Brieanna Betts
//1158732
package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Library {
    private ArrayList<Book> books;
    private Object HashSet;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book)
    {
        books.add(book);
    }

    public ArrayList<Person> getAuthors()
    {
        HashSet hs = new HashSet();
        hs.addAll(books);
        books.clear();
        books.addAll(hs);

        return (ArrayList<Person>) HashSet;
    }

    public ArrayList<Book> getBooksByAuthor(Person author){
        return new ArrayList<>();
    }

    public int getNumOfBooks() {
        {
            int numBooks = 0;
            for (int i = 0; i < 100; i++) {
                if (books.get(i).getAuthor(author)) {
                    numBooks++;
                }
            }
            return getNumOfBooks();
        }
    }
    

    public double getValueOfBooks()
    {
        return -1;
    }

    public void checkOutBook(Book book, Person patron, LocalDate dueDate)
    {
    }

    public ArrayList<Book> getCheckedOutBooks()
    {
        return new ArrayList<>();
    }
}
