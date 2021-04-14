import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số người sử dụng điện: ");
        int size = sc.nextInt();
        BienLai[] bienLais = new BienLai[size];
        QuanLyBienLai quanLyBienLai = new QuanLyBienLai(bienLais);
        int choice = -1;
        do {
            System.out.println("1: Nhập thông tin khách hàng");
            System.out.println("2: Hiển thị thông tin khách hàng");
            System.out.println("3: Hiển thị tiền điện");
            System.out.println("0: Thoát chương trình");
            System.out.println("Nhập lựa chọn: ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    quanLyBienLai.inputBienLais();
                    break;
                case 2:
                    quanLyBienLai.showBienlais();
                    break;
                case 3:
                    quanLyBienLai.showMoneyById();
            }
        }while (choice != 0);
    }
}
