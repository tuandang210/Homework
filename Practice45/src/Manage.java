import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manage {
    List<Vehicle> vehicles = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Manage() {
    }

    public Manage(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void ShowDataFromReadFile() {
        List<Vehicle> b = readData();
        for (Vehicle a : b) {
            System.out.println(a);
        }
    }

    public List<Vehicle> readData() {
        List<Vehicle> x = new ArrayList<>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\233linhnam\\IdeaProjects\\gg\\Practice45\\data.txt"));
            x = (List<Vehicle>) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return x;
    }

    public void writeDataToFile() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\233linhnam\\IdeaProjects\\gg\\Practice45\\data.txt"));
            oos.writeObject(vehicles);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showAllVehicle() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public void showVehicleByProduct() {
        System.out.println("Nhập hãng sản xuất cần tìm");
        String product = sc.next();
        boolean check = checkProduct(product);
        if (check) {
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getManufacturer().equals(product)) {
                    System.out.println(vehicle);
                }
            }
        } else {
            System.out.println("Không có nhà sản xuất đó");
            showVehicleByProduct();
        }
    }

    public boolean checkProduct(String product) {
        boolean check = true;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getManufacturer().equals(product)) {
                check = true;
                break;
            } else {
                check = false;
            }
        }
        return check;
    }

    public void showVehicleByColor() {
        System.out.println("Nhập màu xe cần tìm");
        String color = sc.next();
        boolean check = checkColor(color);
        if (check) {
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getColor().equals(color)) {
                    System.out.println(vehicle);
                }
            }
        } else {
            System.out.println("Không có màu xe đó");
            showVehicleByColor();
        }
    }

    public boolean checkColor(String color) {
        boolean check = true;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getColor().equals(color)) {
                check = true;
                break;
            } else {
                check = false;
            }
        }
        return check;
    }

    public void menu() {
        System.out.println("Nhập lệnh");
        System.out.println("1: Nhập thông tin phương tiện");
        System.out.println("2: Hiển thị thông tin tất cả phương tiện");
        System.out.println("3: Tìm phương tiện theo hãng sản xuất");
        System.out.println("4: Tìm phương tiện theo màu sơn");
        System.out.println("5: Lưu danh sách ra file nhị phân");
        System.out.println("6: Đọc dữ liệu từ file nhị phân");
        System.out.println("0: Thoát chương trình");
    }

    public void inputVehicleInfor() {
        int key = -1;

        System.out.println("1: Nhập thông tin xe hơi");
        System.out.println("2: Nhập thông tin xe moto");
        System.out.println("3: Nhập thông tin xe tải");
        key = sc.nextInt();

        if (key == 1) {
            vehicles.add(inputCarsInformation());
        } else if (key == 2) {
            vehicles.add(inputMotoInformation());
        } else if (key == 3) {
            vehicles.add(inputTruckInformation());
        } else {
            inputVehicleInfor();
        }
    }

    public Vehicle inputCarsInformation() {
        System.out.println("Nhập nhà sản xuất");
        String manufacturer = sc.next();
        System.out.println("Nhập năm sản xuất");
        int yearOfManufacture = sc.nextInt();
        System.out.println("Nhập giá tiền");
        double price = sc.nextDouble();
        System.out.println("Nhập màu xe");
        String color = sc.next();
        System.out.println("Nhập số chỗ ngồi");
        int numberOfSits = sc.nextInt();
        System.out.println("Nhập loại động cơ");
        String typeOfEngine = sc.next();
        return new Cars(manufacturer, yearOfManufacture, price, color, numberOfSits, typeOfEngine);
    }

    public Vehicle inputMotoInformation() {
        System.out.println("Nhập nhà sản xuất");
        String manufacturer = sc.next();
        System.out.println("Nhập năm sản xuất");
        int yearOfManufacture = sc.nextInt();
        System.out.println("Nhập giá tiền");
        double price = sc.nextDouble();
        System.out.println("Nhập màu xe");
        String color = sc.next();
        System.out.println("Nhập dung tích xilanh");
        String cylinderCapacity = sc.next();
        return new Moto(manufacturer, yearOfManufacture, price, color, cylinderCapacity);
    }

    public Vehicle inputTruckInformation() {
        System.out.println("Nhập nhà sản xuất");
        String manufacturer = sc.next();
        System.out.println("Nhập năm sản xuất");
        int yearOfManufacture = sc.nextInt();
        System.out.println("Nhập giá tiền");
        double price = sc.nextDouble();
        System.out.println("Nhập màu xe");
        String color = sc.next();
        System.out.println("Nhập trọng tải");
        double payload = sc.nextDouble();
        return new Truck(manufacturer, yearOfManufacture, price, color, payload);
    }
}
