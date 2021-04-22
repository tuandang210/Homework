import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<AllLibrary> allLibraries = new ArrayList<>();
        Manage manage = new Manage();
        int choice = -1;

        do {
            System.out.println("Nhập lệnh");
            System.out.println("1: Thêm một sách");
            System.out.println("2: Thêm một tạp chí");
            System.out.println("3: Thêm một báo");
            System.out.println("4: Hiển thị thông tin");
            System.out.println("5: Tìm kiếm và hiển thị tài liệu theo loại");
            System.out.println("6: Tìm kiếm và hiển thị tài liệu theo id");
            System.out.println("7: Sắp xếp và hiển thị thư viện theo tên nhà xuất bản");
            System.out.println("0: Thoát chương trình");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    manage.inputBookInformation();
                    break;
                case 2:
                    manage.inputMagazineInformation();
                    break;
                case 3:
                    manage.inputNewspapersInformation();
                    break;
                case 4:
                    manage.disPlayAllLibrary();
                    break;
                case 5:
                    manage.findAllLibraryByType();
                    break;
                case 6:
                    manage.displaySubjectById();
                    break;
                case 7:
                    manage.insertionSortAndDisplay();
                    break;
            }
        } while (choice != 0);
    }
}

