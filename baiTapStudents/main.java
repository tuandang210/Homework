package accessModifier.baiTapStudents;
import java.util.Scanner;

public class main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập số lượng sinh viên");
        int size = sc.nextInt();
        Student[] students = new Student[size];
        //Nhập dữ liệu
        for (int i = 0; i < students.length; i++) {
            students[i] = inputStudentInfo();
        }
        int choice = -1;
        do {
            menu();
            System.out.println("Nhập lựa chọn của bạn");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: {
                    showStudentList(students);
                    break;
                }
                case 2: {
                    students = addNewStudentToList(students);
                    break;
                }
                case 3: {
                    System.out.println("Nhập mã sinh viên cần chỉnh sửa:");
                    String id = sc.nextLine();
                    updateStudentInfo(id, students);
                    break;
                }
                case 4: {
                    System.out.println("Nhập mã sinh viên cần xóa:");
                    String id = sc.nextLine();
                    students = deleteStudent(id, students);
                    break;
                }
                case 5: {
                    findStudentHasMarkMax(students);
                    break;
                }
                case 6: {
                    sortStudentList(students);
                    break;
                }
            }
        } while (choice != 0);
    }

    private static void sortStudentList(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length; j++) {
                if (students[i].getMark() > students[j].getMark()){
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        showStudentList(students);
    }

    private static void findStudentHasMarkMax(Student[] students) {
        double max = students[0].getMark();
        int index = 0;
        for (int i = 0; i < students.length; i++) {
            if (max < students[i].getMark()) {
                max = students[i].getMark();
                index = i;
            }
        }
        System.out.println(students[index]);
    }

    private static Student[] deleteStudent(String id, Student[] students) {
        int index = findStudentById(id, students);
        if (index == -1) {
            return students;
        } else {
            Student[] newStudents = new Student[students.length - 1];
            for (int i = 0; i < index; i++) {
                newStudents[i] = students[i];
            }
            for (int i = index + 1; i < students.length; i++) {
                newStudents[i - 1] = students[i];
            }
            return newStudents;
        }
    }

    public static void updateStudentInfo(String id, Student[] students) {
        int index = findStudentById(id, students);
        if (index != -1) {
            students[index] = inputStudentInfo();
        } else {
            System.out.println("Không tìm thấy sinh viên có mã sinh viên là " + id);
        }
    }

    public static int findStudentById(String id, Student[] students) {
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static Student[] addNewStudentToList(Student[] students) {
        Student[] newStudents = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        newStudents[students.length] = inputStudentInfo();
        return newStudents;
    }

    public static void menu() {
        System.out.println("1. Hiển thị danh sách sinh viên");
        System.out.println("2. Thêm 1 sinh viên");
        System.out.println("3. Chỉnh sửa thông tin sinh viên");
        System.out.println("4. Xóa 1 sinh viên");
        System.out.println("5. Tìm sinh viên có điểm cao nhất");
        System.out.println("6. Sắp xếp danh sách sinh viên có điểm cao -> thấp");
        System.out.println("0. Thoát chương trình");
    }

    public static void showStudentList(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static Student inputStudentInfo() {
        sc.nextLine();
        System.out.println("Nhập mã sinh viên:");
        String id = sc.nextLine();
        System.out.println("Nhập tên sinh viên:");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh:");
        String dateOfBirth = sc.nextLine();
        System.out.println("Nhập điểm:");
        double mark = sc.nextDouble();
        return new Student(id, name, dateOfBirth, mark);
    }
}