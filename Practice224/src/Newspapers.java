import java.util.Scanner;

public class Newspapers extends AllLibrary{
    private String releaseDay;

    public Newspapers() {
    }

    public Newspapers(String releaseDay) {
        this.releaseDay = releaseDay;
    }

    public Newspapers(int id, String publisher, int numberOfReleases, String releaseDay) {
        super(id, publisher, numberOfReleases);
        this.releaseDay = releaseDay;
    }

    public String getReleaseDay() {
        return releaseDay;
    }

    public void setReleaseDay(String releaseDay) {
        this.releaseDay = releaseDay;
    }

    public Newspapers inputNewPapers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin báo");
        System.out.println("Nhập ngày phát hành: ");
        this.releaseDay = sc.next();
        super.inputAllLibrary();
        return this;
    }

    @Override
    public String toString() {
        return "Newspapers " + super.toString()+
                "releaseDay='" + releaseDay + '\'';
    }
}
