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