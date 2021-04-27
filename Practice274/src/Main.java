import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Manage manage = new Manage();
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        do {
            System.out.println("Nhập lệnh");
            System.out.println("1: Thêm thông tin một sinh viên");
            System.out.println("2: Xem danh sách sinh viên");
            System.out.println("3: Cập nhật thông tin một sinh viên");
            System.out.println("4: Xóa thông tin một sinh viên");
            System.out.println("5: Sắp xếp sinh viên theo điểm giảm dần sử dụng bubble sort");
            System.out.println("6: Tìm kiếm những sinh viên có điểm cao nhất");
            System.out.println("7: Tìm kiếm thông tin của một sinh viên theo mã sinh viên sử dụngtìm kiếm nhị phân");
            System.out.println("8: Thống kê số lượng sinh viên của từng lớp");
            System.out.println("9: Ghi danh sách sinh viên ra file");
            System.out.println("10: Đọc danh sách sinh viên từ file");
            System.out.println("0: Thoát chương trình");
            System.out.println("__________________________________________");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    manage.inputStudentInfor();
                    break;
                case 2:
                    manage.displayStudent();
                    break;
                case 3:
                    manage.updateStudentInfo();
                    break;
                case 4:
                    manage.removeStudentById();
                    break;
                case 5:
                    manage.bubbleSortScore();
                    break;
                case 6:
                    manage.sortStudentByScore();
                    break;
                case 7:
                    manage.findStudentById();
                    break;
                case 8:
                    manage.countStudentByClass();
                    break;
                case 9:
                    manage.writeDataToFile();
                    break;
                case 10:
                    manage.readDataFromFile();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}