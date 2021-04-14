import java.util.Scanner;

public class BienLai {
    private int oldIndex;
    private int newIndex;
    private double payMoney;
    private KhachHang person = new KhachHang();

    public BienLai(){
    }

    public BienLai(int oldIndex, int newIndex, double payMoney, KhachHang person) {
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
        this.payMoney = payMoney;
        this.person = person;
    }

    public int getOldIndex() {
        return oldIndex;
    }

    public void setOldIndex(int oldIndex) {
        this.oldIndex = oldIndex;
    }

    public int getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(int newIndex) {
        this.newIndex = newIndex;
    }

    public double getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(double payMoney) {
        this.payMoney = payMoney;
    }

    public KhachHang getPerson() {
        return person;
    }

    public void setPerson(KhachHang person) {
        this.person = person;
    }

    public void inputBienLai(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập thông tin biên lai");
        System.out.println("Chỉ số công tơ cũ: ");
        this.oldIndex = sc.nextInt();
        System.out.println("Chỉ số công tơ mới: ");
        this.newIndex = sc.nextInt();
        System.out.println("Số tiền phải trả: ");
        this.payMoney = (this.newIndex-this.oldIndex)*750;
        this.person.inputKhachHang();
    }

    public void showBienlai(){
        person.showKhachHang();
        System.out.printf(" số công tơ cũ: %d, số công tơ mới: %d, số tiền phải trả: %f\n", this.oldIndex, this.newIndex, this.payMoney);
    }
}
