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
    public static double sum11;
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
                    double salaryFulltime = RealSalaryFulltime(nhanVien);
                    System.out.println(salaryFulltime);
                    break;
                }
                case 3: {
                    double salaryParttime = RealSalaryParttime(nhanVien);
                    System.out.println(salaryParttime);
                    break;
                }
                case 4: {
                    NhanVien[] newNhanVien1 = addMember(nhanVien);
                    System.out.println(Arrays.toString(newNhanVien1));
                    break;
                }
                case 5: {
                    NhanVien[] lowSalary10 = lowSalaryMember(nhanVien);
                    System.out.println(Arrays.toString(lowSalary10));
                    break;
                }
                case 6: {
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
                sum += realSalary2;
            }
        }
        return sum;
    }

    public static NhanVien[] lowSalaryMember(NhanVien[] nhanVien) {
        int j = 0;
        for (int i = 0; i < nhanVien.length; i++) {
            if (nhanVien[i] instanceof NhanVienFulltime) {
                sum11 += RealSalaryFulltime(nhanVien);
            }
        }
        avgSalary = sum11 / nhanVien.length;
        for (int i = 0; i < nhanVien.length; i++) {
            if (realSalary1 < avgSalary) {
                lowNhanVien[j] = nhanVien[i];
                j++;
            }
        }
        return lowNhanVien;
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
        System.out.println("2: Lương thực lĩnh nhân viên fulltime");
        System.out.println("3: Lương thực lĩnh nhân viên parttime");
        System.out.println("4: Thêm một nhân viên");
        System.out.println("5: Liệt kê những nhân viên fulltime có mức lương thấp hơn trung bình");
        System.out.println("6: Tổng lương phải trả cho nhân viên parttime");
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

    public static double RealSalaryFulltime(NhanVien[] nhanVien) {
        for (NhanVien x : nhanVien) {
            if (x instanceof NhanVienFulltime) {
                realSalary1 = ((NhanVienFulltime) x).getHardSalary() - ((NhanVienFulltime) x).getFinedMoney() +
                        ((NhanVienFulltime) x).getBonusMoney();
            }
        }
        return realSalary1;
    }
    

    public static double RealSalaryParttime(NhanVien[] nhanVien) {
        for (NhanVien x : nhanVien) {
            if (x instanceof NhanVienParttime) {
                realSalary2 = ((NhanVienParttime) x).getNumberOfWork() * 100000;
            }
        }
        return realSalary2;
    }
}
