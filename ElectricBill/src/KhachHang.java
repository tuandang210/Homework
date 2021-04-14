import java.util.Scanner;

public class KhachHang {
    private String name;
    private String address;
    private int id;

    public KhachHang(){
    }

    public KhachHang(String name, String address, int id) {
        this.name = name;
        this.address = address;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void inputKhachHang(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhâp họ tên: ");
        this.name = sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        this.address = sc.nextLine();
        System.out.println("Nhập mã công tơ điện: ");
        this.id = sc.nextInt();
    }

    public void showKhachHang(){
        System.out.printf("Họ và tên %s, địa chỉ %s, mã công tơ điện %d", name, address, id);
    }
}
