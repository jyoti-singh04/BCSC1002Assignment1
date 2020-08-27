/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String bookName;
    private String authorNameOfTheBook;
    private String ISBNNumberOfTheBook;


    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorNameOfTheBook(String authorNameOfTheBook) {
        this.authorNameOfTheBook = authorNameOfTheBook;
    }

    public void setISBNNumberOfTheBook(String ISBNNumberOfTheBook) {
        this.ISBNNumberOfTheBook = ISBNNumberOfTheBook;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorNameOfTheBook() {
        return authorNameOfTheBook;
    }

    public String getISBNNumberOfTheBook() {
        return ISBNNumberOfTheBook;
    }
}
