import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manage manage = new Manage();
        int choice = -1;

        do {
            manage.menu();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    manage.inputVehicleInfor();
                    break;
                case 2:
                    manage.showAllVehicle();
                    break;
                case 3:
                    manage.showVehicleByProduct();
                    break;
                case 4:
                    manage.showVehicleByColor();
                    break;
                case 5:
                    manage.writeDataToFile();
                    break;
                case 6:
                    manage.ShowDataFromReadFile();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}
