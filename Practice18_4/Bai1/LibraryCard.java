package Bai1;

import java.util.Scanner;

public class LibraryCard {
    private int ticketId;
    private String dateOfBorrow;
    private String returnDate;
    private int bookId;
    private Student student = new Student();

    public LibraryCard() {
    }

    public LibraryCard(int ticketId, String dateOfBorrow, String returnDate, int bookId, Student student) {
        this.ticketId = ticketId;
        this.dateOfBorrow = dateOfBorrow;
        this.returnDate = returnDate;
        this.bookId = bookId;
        this.student = student;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getDateOfBorrow() {
        return dateOfBorrow;
    }

    public void setDateOfBorrow(String dateOfBorrow) {
        this.dateOfBorrow = dateOfBorrow;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public LibraryCard inputLibraryData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin");
        System.out.println("Nhập số thẻ: ");
        int ticketId = sc.nextInt();
        System.out.println("Nhập ngày mượn: ");
        String dateOfBorrow = sc.next();
        System.out.println("Nhập hạn trả: ");
        String returnDate = sc.next();
        System.out.println("Nhập mã số sách: ");
        int bookId = sc.nextInt();
        student.inputStudent();
        return new LibraryCard(ticketId, dateOfBorrow, returnDate, bookId, student);
    }

    public void displayLibraryCard(LibraryCard libraryCard){
        System.out.println(libraryCard.toString());
    }

    @Override
    public String toString() {
        return "Bai1.LibraryCard{" +
                "ticketId=" + ticketId +
                ", dateOfBorrow='" + dateOfBorrow + '\'' +
                ", returnDate='" + returnDate + '\'' +
                ", bookId=" + bookId +
                ", student=" + student +
                '}';
    }
}
