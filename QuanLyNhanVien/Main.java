package QuanLyNhanVien;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static double realSalary1;
    public static double realSalary2;
    public static int choice;
    public static NhanVien[] nhanVien;
    public static NhanVien[] newNhanVien;
    public static NhanVien[] lowNhanVien;
    public static int pick;
    public static double avgSalary;
    public static double sum11 = 0;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //Nhập thông tin
        System.out.print("Nhập số lượng nhân viên fulltime: ");
        int size1 = sc.nextInt();

        System.out.print("Nhập số lượng nhân viên parttime: ");
        int size2 = sc.nextInt();

        nhanVien = new NhanVien[size1 + size2];
        for (int i = 0; i < size1; i++) {
            nhanVien[i] = input1();
        }
        for (int i = size1; i < nhanVien.length; i++) {
            nhanVien[i] = input2();
        }

        do {
            menu();
            System.out.print("Nhập lựa chọn của bạn");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1: {
                    Display(nhanVien);
                    break;
                }
                case 2: {
                    NhanVien[] newNhanVien1 = addMember(nhanVien);
                    System.out.println(Arrays.toString(newNhanVien1));
                    break;
                }
                case 3: {
                    lowSalaryMember(nhanVien);
                    break;
                }
                case 4: {
                    double allSum = allSalaryParttime(nhanVien);
                    System.out.println(allSum);
                    break;
                }
            }
        } while (choice != 0);
    }

    public static double allSalaryParttime(NhanVien[] nhanVien) {
        double sum = 0;
        for (int i = 0; i < nhanVien.length; i++) {
            if (nhanVien[i] instanceof NhanVienParttime) {
                sum += RealSalaryParttime((NhanVienParttime) nhanVien[i]);
            }
        }
        return sum;
    }

    public static void lowSalaryMember(NhanVien[] nhanVien) {
        int j = 0;
        int count = 0;
        for (int i = 0; i < nhanVien.length; i++) {
            if (nhanVien[i] instanceof NhanVienFulltime) {
                count++;
                sum11 += RealSalaryFulltime((NhanVienFulltime) nhanVien[i]);
            }
        }
        avgSalary = sum11 / nhanVien.length;
        lowNhanVien = new NhanVien[count];
        for (int i = 0; i < nhanVien.length; i++) {
            if (nhanVien[i] instanceof NhanVienFulltime) {
                lowNhanVien[j] = (NhanVienFulltime) nhanVien[i];
                j++;
            }
        }

        for (int i = 0; i < lowNhanVien.length; i++) {
            if (RealSalaryFulltime((NhanVienFulltime) lowNhanVien[i]) < avgSalary) {
                System.out.println(lowNhanVien[i]);
            }
        }
    }

    public static NhanVien[] addMember(NhanVien[] nhanVien) {
        newNhanVien = new NhanVien[nhanVien.length + 1];
        for (int i = 0; i < nhanVien.length; i++) {
            newNhanVien[i] = nhanVien[i];
        }
        System.out.println("1: Thêm nhân viên fulltime");
        System.out.println("2: Thêm nhân viên parttime");
        System.out.println("Nhập lựa chọn của bạn");
        pick = sc.nextInt();
        if (pick == 1) {
            newNhanVien[nhanVien.length] = input1();
        } else {
            newNhanVien[nhanVien.length] = input2();
        }
        return newNhanVien;
    }

    public static void menu() {
        System.out.println("1: Hiển thị thông tin nhân viên");
        System.out.println("2: Thêm một nhân viên");
        System.out.println("3: Liệt kê những nhân viên fulltime có mức lương thấp hơn trung bình");
        System.out.println("4: Tổng lương phải trả cho nhân viên parttime");
    }


    public static void Display(NhanVien[] nhanVien) {
        for (NhanVien x : nhanVien) {
            System.out.println(x);
        }
    }

    public static NhanVien input1() {
        System.out.print("Nhập id: ");
        String id = sc.next();
        System.out.print("Nhập tên: ");
        String name = sc.next();
        System.out.print("Nhập tuổi: ");
        int yearOld = sc.nextInt();
        System.out.print("Nhập số điện thoại: ");
        String phoneNumber = sc.next();
        System.out.print("Nhập email: ");
        String email = sc.next();
        System.out.print("Nhập tiền thưởng: ");
        double bonusMoney = sc.nextDouble();
        System.out.print("Nhập tiền phạt: ");
        double finedMoney = sc.nextDouble();
        System.out.print("Nhập lương cứng: ");
        double hardSalary = sc.nextDouble();
        return new NhanVienFulltime(id, name, yearOld, phoneNumber, email, bonusMoney, finedMoney, hardSalary);
    }

    public static NhanVien input2() {
        System.out.print("Nhập id: ");
        String id = sc.next();
        System.out.print("Nhập tên: ");
        String name = sc.next();
        System.out.print("Nhập tuổi: ");
        int yearOld = sc.nextInt();
        System.out.print("Nhập số điện thoại: ");
        String phoneNumber = sc.next();
        System.out.print("Nhập email: ");
        String email = sc.next();
        System.out.print("Nhập thời gian làm việc: ");
        int numberOfWork = sc.nextInt();
        return new NhanVienParttime(id, name, yearOld, phoneNumber, email, numberOfWork);
    }

    public static double RealSalaryFulltime(NhanVienFulltime nhanVienFulltime) {
        realSalary1 = nhanVienFulltime.getHardSalary() - nhanVienFulltime.getFinedMoney() + nhanVienFulltime.getBonusMoney();
        return realSalary1;
    }


    public static double RealSalaryParttime(NhanVienParttime nhanVienParttime) {
        realSalary2 = nhanVienParttime.getNumberOfWork() * 100000;
        return realSalary2;
    }
}
