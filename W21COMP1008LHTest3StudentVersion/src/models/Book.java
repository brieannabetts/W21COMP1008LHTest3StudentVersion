//Brieanna Betts
//1158732
package models;

import java.time.LocalDate;

public class Book {
    private String title;
    private Person author;
    private double price;
    private LocalDate returnDate;
    private Person libraryPatron;

    public Book(String title, Person author, double price) {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String bookName) {
        bookName= bookName.trim();
        if (bookName.length() >= 2) {
            bookName = bookName.substring(0, 1).toUpperCase() + bookName.substring(1);
            this.title = bookName;
        }
        else
            throw new IllegalArgumentException("The book title must have at least 2 characters");
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person person) {
        this.author = person;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
    }

    public void checkOutBook(Person libraryPatron, LocalDate dueDate)
    {
    }

    public LocalDate getReturnDate()
    {
        return returnDate;
    }

    public boolean isAvailable()
    {
        return false;
    }


    public String toString()
    {
        return null;
    }
}
