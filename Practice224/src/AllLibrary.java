import java.util.Scanner;

public class AllLibrary {
    private int id;
    private String publisher;
    private int numberOfReleases;

    public AllLibrary() {
    }

    public AllLibrary(int id, String publisher, int numberOfReleases) {
        this.id = id;
        this.publisher = publisher;
        this.numberOfReleases = numberOfReleases;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNumberOfReleases() {
        return numberOfReleases;
    }

    public void setNumberOfReleases(int numberOfReleases) {
        this.numberOfReleases = numberOfReleases;
    }

    public AllLibrary inputAllLibrary() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã tài liệu: ");
        this.id = sc.nextInt();
        System.out.println("Nhập tên nhà xuất bản: ");
        this.publisher = sc.next();
        System.out.println("Nhập số lượng phát hành: ");
        this.numberOfReleases = sc.nextInt();
        return this;
    }

    public void displayAllLibrary(AllLibrary allLibrary) {
        System.out.println(allLibrary.toString());
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", publisher='" + publisher + '\'' +
                ", numberOfReleases=" + numberOfReleases+ " ,";
    }
}
