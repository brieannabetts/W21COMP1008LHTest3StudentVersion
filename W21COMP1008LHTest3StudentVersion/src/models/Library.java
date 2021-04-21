//Brieanna Betts
//1158732
package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

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
        int numBooks = 0;
        for (int i = 0; i < 100; i++) {
            if (books.get(i).getAuthor(author)) {
                numBooks++;
            }
        }
        return new ArrayList<>();
    }

    public int getNumOfBooks() {
        return books.size();
    

    public double getValueOfBooks() {
        double valueOfBooks = 0;
        if (books.size()>0){
            for (Book category : books){
    valueOfBooks += category.getPrice();
        }
    }
        return (int) valueOfBooks;
    }


    public void checkOutBook(Book books, Person patron, LocalDate dueDate)
    {
        if (books.isAvailable()){
            this.checkOutBook();
        }else
            throw new IllegalArgumentException("book is not available");
        }
    }


    public ArrayList<Book> getCheckedOutBooks()
    {
        return new ArrayList<>();
    }
}
