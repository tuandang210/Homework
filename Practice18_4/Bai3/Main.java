package Bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manageeeee manageeeee = new Manageeeee();

        int choice = -1;
        do {
            System.out.println("Nhập lệnh");
            System.out.println("1: Nhập thông tin kỹ sư");
            System.out.println("2: Nhập thông tin nhân viên");
            System.out.println("3: Nhập thông tin công nhân");
            System.out.println("4: Hiển thị thông tin cán bộ nhân viên");
            System.out.println("5: Tìm thông tin cán bộ nhân viên bằng tên");
            System.out.println("0: Thoát chương trình");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    manageeeee.inputKySu();
                    break;
                case 2:
                    manageeeee.inputNhanVien();
                    break;
                case 3:
                    manageeeee.inputCongNhan();
                    break;
                case 4:
                    manageeeee.displayCanBo();
                    break;
                case 5:
                    System.out.println("Nhập tên cần tìm: ");
                    String name = sc.nextLine();
                    manageeeee.showCanBoByName(name);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}
