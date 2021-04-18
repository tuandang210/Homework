package Bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<LibraryCard> libraryCards = new ArrayList<>();
        LibraryManagement libraryManagement = new LibraryManagement();
        int choice = -1;
        do {
            System.out.println("Nhập lệnh");
            System.out.println("1: Nhập thông tin mượn sách");
            System.out.println("2: Hiển thị thông tin sinh viên mượn sách");
            System.out.println("3: Hiển thị tên sách cần trả vào ngày cuối tháng");
            System.out.println("0: Thoát chương trình");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    libraryManagement.inputLibraryData();
                    break;
                case 2:
                    libraryManagement.displayLibraryData();
                    break;
                case 3:
                    String returnDay = sc.nextLine();
                    libraryManagement.showBookIdByReturnDay(returnDay);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}

