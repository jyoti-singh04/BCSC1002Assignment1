/*  Created by IntelliJ IDEA.
 *  User: Jyoti Singh (jyoti-singh04)
 *  Date: 30/08/20
 *  Time: 4:50 AM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] store;

    public Library() {
        this.store = new Book[5];
        for (int i = 0; i < store.length; i++) {
            store[i] = new Book("Book " + (i + 1));
        }
    }

    public Library(Book[] store) {
        this.store = store;
    }

    public void addBook(String name) {
        System.out.println(name + " is now issued.");
    }

    public void doReturn(String name) {
        System.out.println("Thank you for returning.");
    }

    public void listBook() {
        for (Book book : store) {
            System.out.println(book);
        }
    }

    public void issueBook(String name, int rating) {
        System.out.println("The " + name + "\" is issued to you.");
    }

    public Book[] getStore() {
        return store.clone();
    }

    public void setStore(Book[] store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return Arrays.toString(store);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Library that = (Library) o;
        return Arrays.equals(getStore(), that.getStore());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getStore());
    }

}
