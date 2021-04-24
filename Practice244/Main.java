import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Manage manage = new Manage();
        int choice = -1;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhập lệnh: ");
            System.out.println("1: Nhập thông tin thí sinh khối A");
            System.out.println("2: Nhập thông tin thí sinh khối B");
            System.out.println("3: Nhập thông tin thí sinh khối C");
            System.out.println("4: Hiển thị thông tin các thí sinh");
            System.out.println("5: Sắp xếp thí sinh theo tên");
            System.out.println("6: Sắp xếp thí sinh theo id");
            System.out.println("7: Tìm thí sinh theo id");
            System.out.println("8: Chỉnh sửa thông tin thí sinh theo id");
            System.out.println("9: Xóa thông tin của thí sinh theo id");
            System.out.println("0: Thoát chương trình");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    manage.inputBlockA();
                    break;
                case 2:
                    manage.inputBockB();
                    break;
                case 3:
                    manage.inputBockC();
                    break;
                case 4:
                    manage.showStudentInformation();
                    break;
                case 5:
                    manage.selectionSortName();
                    break;
                case 6:
                    manage.selectionSortId();
                    break;
                case 7:
                    manage.showStudentById();
                    break;
                case 8:
                    manage.changeStudentInforById();
                    break;
                case 9:
                    manage.removeStudentById();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}
