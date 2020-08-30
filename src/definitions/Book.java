/*  Created by IntelliJ IDEA.
 *  User: Jyoti Singh (jyoti-singh04)
 *  Date: 30/08/20
 *  Time: 4:50 AM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String bookName;
    private String authorNameOfTheBook;
    private String ISBNNumberOfTheBook;

    public Book() {
        this.bookName = "";
        this.authorNameOfTheBook = "";
        this.ISBNNumberOfTheBook = "";
    }

    public Book(String bookName, String authorNameOfTheBook, String ISBNNumberOfTheBook) {
        this.bookName = bookName;
        this.authorNameOfTheBook = authorNameOfTheBook;
        this.ISBNNumberOfTheBook = ISBNNumberOfTheBook;
    }

    public Book(String bookName) {
        this.bookName = "Harry Potter";
        this.authorNameOfTheBook = "J. K. Rowling";
        this.ISBNNumberOfTheBook = "9865471235845";
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorNameOfTheBook() {
        return authorNameOfTheBook;
    }

    public void setAuthorNameOfTheBook(String authorNameOfTheBook) {
        this.authorNameOfTheBook = authorNameOfTheBook;
    }

    public String getISBNNumberOfTheBook() {
        return ISBNNumberOfTheBook;
    }

    public void setISBNNumberOfTheBook(String ISBNNumberOfTheBook) {
        this.ISBNNumberOfTheBook = ISBNNumberOfTheBook;
    }

    public String toString() {
        return String.format(
                "Book Name: %s, Book AuthorNameOfTheBook: %s, Book ISBN Number: %b",
                getBookName(), getAuthorNameOfTheBook(), getISBNNumberOfTheBook()
        );
    }

}