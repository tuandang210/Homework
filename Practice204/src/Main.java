import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<AllTeacher> allTeachers = new ArrayList<>();

        int choice = -1;
        do {
            System.out.println("Nhập lệnh");
            System.out.println("1: Nhập thông tin giáo viên");
            System.out.println("2: Hiển thị thông tin giáo viên");
            System.out.println("3: Tính lương thực lĩnh của giáo viên");
            System.out.println("4: Hiển thị thông tin giáo viên có lương nhiều hơn 8 triệu");
            System.out.println("0: Thoát chương trình");

            choice = sc.nextInt();
            switch (choice){
                case 1:
                    allTeachers.add(new AllTeacher().inputALlTeacher());
                    break;
                case 2:
                    for (AllTeacher x : allTeachers){
                        System.out.println(x.toString());
                    }
                    break;
                case 3:
                    for (AllTeacher allTeacher : allTeachers) {
                        System.out.println("Thực lĩnh: "+allTeacher.
                                getTeacher().getName()+" "+allTeacher.
                                realSalary(allTeacher)+" VND");
                    }
                    break;
                case 4:
                    for (AllTeacher allTeacher : allTeachers){
                        if(allTeacher.realSalary(allTeacher)>8000){
                            System.out.println(allTeacher);
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice!=0);
    }
}
