import java.util.Scanner;

public class BlockC extends Student{
    private int literaryScore;
    private int historicalScore;
    private int geographicalScore;

    public BlockC(){
    }

    public BlockC(int literaryScore, int historicalScore, int geographicalScore) {
        this.literaryScore = literaryScore;
        this.historicalScore = historicalScore;
        this.geographicalScore = geographicalScore;
    }

    public BlockC(int id, String name, String address, int area, int literaryScore, int historicalScore, int geographicalScore) {
        super(id, name, address, area);
        this.literaryScore = literaryScore;
        this.historicalScore = historicalScore;
        this.geographicalScore = geographicalScore;
    }

    public int getLiteraryScore() {
        return literaryScore;
    }

    public void setLiteraryScore(int literaryScore) {
        this.literaryScore = literaryScore;
    }

    public int getHistoricalScore() {
        return historicalScore;
    }

    public void setHistoricalScore(int historicalScore) {
        this.historicalScore = historicalScore;
    }

    public int getGeographicalScore() {
        return geographicalScore;
    }

    public void setGeographicalScore(int geographicalScore) {
        this.geographicalScore = geographicalScore;
    }

    public BlockC inputBockCInfor(){
        inputStudent();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm văn: ");
        this.literaryScore = sc.nextInt();
        System.out.println("Nhập điểm lịch sử: ");
        this.historicalScore = sc.nextInt();
        System.out.println("Nhập điểm địa lý: ");
        this.geographicalScore = sc.nextInt();
        return this;
    }

    @Override
    public String toString() {
        return super.toString() + " literaryScore=" + literaryScore +
                ", historicalScore=" + historicalScore +
                ", geographicalScore=" + geographicalScore;
    }
}
