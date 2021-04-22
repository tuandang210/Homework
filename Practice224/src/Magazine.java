import java.util.Scanner;

public class Magazine extends AllLibrary {
    private int issue;
    private int releaseMonth;

    public Magazine() {
    }

    public Magazine(int issue, int releaseMonth) {
        this.issue = issue;
        this.releaseMonth = releaseMonth;
    }

    public Magazine(int id, String publisher, int numberOfReleases, int issue, int releaseMonth) {
        super(id, publisher, numberOfReleases);
        this.issue = issue;
        this.releaseMonth = releaseMonth;
    }

    public int getIssue() {
        return issue;
    }

    public void setIssue(int issue) {
        this.issue = issue;
    }

    public int getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(int releaseMonth) {
        this.releaseMonth = releaseMonth;
    }

    public Magazine inputMagazine() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin tạp chí");
        System.out.println("Nhập số phát hành: ");
        this.issue = sc.nextInt();
        System.out.println("Nhập tháng phát hành: ");
        this.releaseMonth = sc.nextInt();
        super.inputAllLibrary();
        return this;
    }

    @Override
    public String toString() {
        return "Magazine " + super.toString() +
                " issue=" + issue +
                ", releaseMonth=" + releaseMonth;
    }
}
