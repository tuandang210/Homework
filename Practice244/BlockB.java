import java.util.Scanner;

public class BlockB extends Student{
    private int mathScore;
    private int chemistryScore;
    private int biologicalScore;

    public BlockB(){
    }

    public BlockB(int mathScore, int chemistryScore, int biologicalScore) {
        this.mathScore = mathScore;
        this.chemistryScore = chemistryScore;
        this.biologicalScore = biologicalScore;
    }

    public BlockB(int id, String name, String address, int area, int mathScore, int chemistryScore, int biologicalScore) {
        super(id, name, address, area);
        this.mathScore = mathScore;
        this.chemistryScore = chemistryScore;
        this.biologicalScore = biologicalScore;
    }

    public BlockB inputBockBInfor(){
        inputStudent();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm toán: ");
        this.mathScore = sc.nextInt();
        System.out.println("Nhập điểm hóa học: ");
        this.chemistryScore = sc.nextInt();
        System.out.println("Nhập điểm sinh học: ");
        this.biologicalScore = sc.nextInt();
        return this;
    }

    @Override
    public String toString() {
        return super.toString() + " mathScore=" + mathScore +
                ", chemistryScore=" + chemistryScore +
                ", biologicalScore=" + biologicalScore;
    }
}
