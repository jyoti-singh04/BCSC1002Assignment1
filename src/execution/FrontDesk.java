/*  Created by IntelliJ IDEA.
 *  User: Jyoti Singh (jyoti-singh04)
 *  Date: 30/08/20
 *  Time: 4:50 AM
 *  File Name : Book.java
 * */
package execution;

import definitions.Library;

import java.util.Scanner;

public class FrontDesk {
    private static final int ISSUE_A_NEW_BOOK_FOR_ME = 1;
    private static final int RETURN_A_NEW_BOOK_FOR_ME = 2;
    private static final int SHOW_ME_ALL_MY_ISSUES_BOOK_FOR_ME = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int clientInput;
        Library myLibrary = new Library();
        do {
            System.out.println("-=-=--=-Welcome to front desk-=-=--=-");
            System.out.println("How may I help you today? ");
            System.out.println("1. Issue a new book for me. ");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit: ");
            System.out.println("Enter your choice: ");
            clientInput = scanner.nextInt();
            String bookName;
            int rating;
            switch (clientInput) {
                case ISSUE_A_NEW_BOOK_FOR_ME:
                    System.out.println("Enter the name of the book that you want to issue: ");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    myLibrary.addBook(bookName);
                    break;
                case RETURN_A_NEW_BOOK_FOR_ME:
                    System.out.println("Enter the name of the book you want to return: ");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    myLibrary.doReturn(bookName);
                    break;
                case SHOW_ME_ALL_MY_ISSUES_BOOK_FOR_ME:
                    myLibrary.listBook();
                    break;
                default:
            }
        } while (clientInput != EXIT);
        scanner.close();
    }
}
