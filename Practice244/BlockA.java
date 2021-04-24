import java.util.Scanner;

public class BlockA extends Student{
    private int mathScore;
    private int physicsScore;
    private int chemistryScore;

    public BlockA() {
    }

    public BlockA(int mathScore, int physicsScore, int chemistryScore) {
        this.mathScore = mathScore;
        this.physicsScore = physicsScore;
        this.chemistryScore = chemistryScore;
    }

    public BlockA(int id, String name, String address, int area, int mathScore, int physicsScore, int chemistryScore) {
        super(id, name, address, area);
        this.mathScore = mathScore;
        this.physicsScore = physicsScore;
        this.chemistryScore = chemistryScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getPhysicsScore() {
        return physicsScore;
    }

    public void setPhysicsScore(int physicsScore) {
        this.physicsScore = physicsScore;
    }

    public int getChemistryScore() {
        return chemistryScore;
    }

    public void setChemistryScore(int chemistryScore) {
        this.chemistryScore = chemistryScore;
    }

    public BlockA inputBockAInfor(){
        inputStudent();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm toán: ");
        this.mathScore = sc.nextInt();
        System.out.println("Nhập điểm vật lý: ");
        this.physicsScore = sc.nextInt();
        System.out.println("Nhập điểm hóa học: ");
        this.chemistryScore = sc.nextInt();
        return this;
    }

    @Override
    public String toString() {
        return super.toString() + " mathScore=" + mathScore +
                ", physicsScore=" + physicsScore +
                ", chemistryScore=" + chemistryScore;
    }
}
