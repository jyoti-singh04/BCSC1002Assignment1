/*  Created by IntelliJ IDEA.
 *  User: Jyoti Singh (jyoti-singh04)
 *  Date: 30/08/20
 *  Time: 4:50 AM
 *  File Name : Book.java
 * */
package definitions;

public class Library {
    private Book[] store;

    public Book[] getStore() {
        return store.clone();
    }

    public void setStore(Book[] store) {
        this.store = store;
    }

}
