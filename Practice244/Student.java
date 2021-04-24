import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String address;
    private int area;

    public Student() {
    }

    public Student(int id, String name, String address, int area) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.area = area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public Student inputStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin thí sinh");
        System.out.println("Nhập số báo danh: ");
        this.id = sc.nextInt();
        System.out.println("Nhập họ và tên: ");
        this.name = sc.next();
        System.out.println("Nhập địa chỉ: ");
        this.address = sc.next();
        System.out.println("Nhập mã khu vực: ");
        this.area = sc.nextInt();
        return this;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name=" + name +
                ", address=" + address +
                ", area=" + area;
    }
}
