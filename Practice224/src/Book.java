import java.util.Scanner;

public class Book extends AllLibrary{
    private String author;
    private int numberOfPages;

    public Book() {
    }

    public Book(String author, int numberOfPages) {
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public Book(int id, String publisher, int numberOfReleases, String author, int numberOfPages) {
        super(id, publisher, numberOfReleases);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Book inputBookInfor(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập thông tin sách");
        System.out.println("Nhập tên tác giả: ");
        this.author = sc.next();
        System.out.println("Nhập số lượng trang: ");
        this.numberOfPages = sc.nextInt();
        super.inputAllLibrary();
        return this;
    }

    @Override
    public String toString() {
        return "Book " +
                super.toString()+
                " author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages
                ;
    }
}
