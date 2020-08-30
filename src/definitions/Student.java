/*  Created by IntelliJ IDEA.
 *  User: Jyoti Singh (jyoti-singh04)
 *  Date: 30/08/20
 *  Time: 4:50 AM
 *  File Name : Book.java
 * */
package definitions;

public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private long universityRollNumber;
    private int booksIssueByTheStudent;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public int getBooksIssueByTheStudent() {
        return booksIssueByTheStudent;
    }

    public void setBooksIssueByTheStudent(int booksIssueByTheStudent) {
        this.booksIssueByTheStudent = booksIssueByTheStudent;
    }

    public Student() {
        this.firstName = "";
        this.middleName = "";
        this.lastName = "";
        this.universityRollNumber = 0;
        this.booksIssueByTheStudent = 0;
    }

    public Student(String firstName, String middleName, String lastName, long universityRollNumber, int booksIssueByTheStudent) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.universityRollNumber = universityRollNumber;
        this.booksIssueByTheStudent = booksIssueByTheStudent;
    }

    public Student(String firstName) {
        this.firstName = firstName;
        this.middleName = "J";
        this.lastName = "Singh";
        this.universityRollNumber = 191500;
        this.booksIssueByTheStudent = 0;
    }

    public String toString() {
        return String.format(
                "Student FirstName: %s, Student MiddleName: %s, Student LastName: %s, Student UniversityRollNumber: %d, Student BooksIssueByTheStudent: %d",
                getFirstName(), getMiddleName(), getLastName(), getUniversityRollNumber(), getBooksIssueByTheStudent()
        );
    }

}