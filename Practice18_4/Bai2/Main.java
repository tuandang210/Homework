package Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {List<Family> families = new ArrayList<>();

        Manage manages = new Manage();
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin hộ gia đình");
        System.out.println("Nhập số hộ gia đình");
        int all = sc.nextInt();
        for (int i =0; i<all; i++) {
            manages.inputTown();
        }
        do {
            System.out.println("Nhập lệnh");
            System.out.println("1: Hiển thị thông tin hộ gia đình");
            System.out.println("2: Hiển thị hộ gia đình có người lớn hơn 80 tuổi");
            System.out.println("0: Thoát chương trình");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    manages.displayTown();
                    break;
                case 2:
                    manages.findAgeMoreThan80();
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice !=0);
    }
}
