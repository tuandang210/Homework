package QuanLyNhanVien;

public class NhanVienFulltime extends NhanVien{
    private double bonusMoney;
    private double finedMoney;
    private double hardSalary;

    public NhanVienFulltime(){
    }

    public NhanVienFulltime(double bonusMoney, double finedMoney, double hardSalary) {
        this.bonusMoney = bonusMoney;
        this.finedMoney = finedMoney;
        this.hardSalary = hardSalary;
    }

    public NhanVienFulltime(String id, String name, int yearOld, String phoneNumber, String email, double bonusMoney, double finedMoney, double hardSalary) {
        super(id, name, yearOld, phoneNumber, email);
        this.bonusMoney = bonusMoney;
        this.finedMoney = finedMoney;
        this.hardSalary = hardSalary;
    }

    public double getBonusMoney() {
        return bonusMoney;
    }

    public void setBonusMoney(double bonusMoney) {
        this.bonusMoney = bonusMoney;
    }

    public double getFinedMoney() {
        return finedMoney;
    }

    public void setFinedMoney(double finedMoney) {
        this.finedMoney = finedMoney;
    }

    public double getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(double hardSalary) {
        this.hardSalary = hardSalary;
    }

    @Override
    public String toString() {
        return "NhanVienFulltime{" +
                "bonusMoney=" + bonusMoney +
                ", finedMoney=" + finedMoney +
                ", hardSalary=" + hardSalary +
                '}';
    }
}
