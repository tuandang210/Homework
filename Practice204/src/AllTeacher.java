import java.util.Scanner;

public class AllTeacher {
    private double hardSalary;
    private double bonusSalary;
    private double finedSalary;
    private Teacher teacher = new Teacher();

    public AllTeacher() {
    }

    public AllTeacher(double hardSalary, double bonusSalary, double finedSalary, Teacher teacher) {
        this.hardSalary = hardSalary;
        this.bonusSalary = bonusSalary;
        this.finedSalary = finedSalary;
        this.teacher = teacher;
    }

    public double getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(double hardSalary) {
        this.hardSalary = hardSalary;
    }

    public double getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(double bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public double getFinedSalary() {
        return finedSalary;
    }

    public void setFinedSalary(double finedSalary) {
        this.finedSalary = finedSalary;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public AllTeacher inputALlTeacher() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin của giáo viên");
        this.teacher = teacher.inputTeacherInfor();
        System.out.println("Nhập lương cứng: ");
        this.hardSalary = sc.nextDouble();
        System.out.println("Nhập lương thưởng: ");
        this.bonusSalary = sc.nextDouble();
        System.out.println("Nhập lương phạt: ");
        this.finedSalary = sc.nextDouble();
        return this;
    }

    public void displayAllTeacher(AllTeacher allTeacher) {
        System.out.println(allTeacher.toString());
    }

    public double realSalary(AllTeacher allTeacher) {
        return allTeacher.getHardSalary() + allTeacher.getBonusSalary() - allTeacher.getFinedSalary();
    }

    @Override
    public String toString() {
        return "AllTeacher{" +
                "hardSalary=" + hardSalary +
                ", bonusSalary=" + bonusSalary +
                ", finedSalary=" + finedSalary +
                ", teacher=" + teacher +
                '}' + "\n";
    }
}
