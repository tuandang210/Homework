import java.io.*;
import java.util.*;

public class Manage {
    List<Student> students = new ArrayList<>();
    Scanner sc =new Scanner(System.in);
    public void readDataFromFile() {
        sc.nextLine();
        System.out.println("Nhập đường dẫn file cần đọc");
        String studentData1 = sc.nextLine();
        List<Student> x = readDataFromFile(studentData1);
        for(Student e : students){
            System.out.println(e);
        }
    }

    public void countStudentByClass() {
        HashMap<String,Integer> abc = new HashMap<>();
        for(Student student: students){
            if(abc.containsKey(student.getInClass())){
                abc.put(student.getInClass(), abc.get(student.getInClass())+1);
            } else {
                abc.put(student.getInClass(), 1);
            }
        }
        for (Map.Entry<String, Integer> entry : abc.entrySet()){
            System.out.println("Lớp "+ entry.getKey()+" có " +entry.getValue()+" sinh viên.");
        }
    }

    public void findStudentById() {
        int c = checkId();
        if(c==-1){
            System.out.println("Không có mã sinh viên này");
        } else {
            System.out.println(students.get(c).toString());
        }
    }

    public void sortStudentByScore() {
        for(int i = 0; i< students.size(); i++){
            if(students.get(i).getScore()>=8){
                System.out.println(students.get(i)+"\n");
            }
        }
    }

    public void displayStudent() {
        System.out.println(students);
    }

    public void inputStudentInfor() {
        students.add(new Student().inputStudent());
    }

    public  List<Student> readDataFromFile(String path) {
        List<Student> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return products;
    }

    public void writeDataToFile() {
        sc.nextLine();
        System.out.println("Nhập đường dẫn file cần ghi");
        String studentData = sc.nextLine();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(studentData));
            oos.writeObject(students);
            oos.close();
        } catch (IOException e) {
            System.err.println("File không tồn tại");
        }
    }

    public  void bubbleSortScore() {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = 0; j < students.size() - i - 1; j++) {
                if (students.get(j).getScore() < students.get(j + 1).getScore()) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }
    }

    public void removeStudentById() {
        int b = checkId();
        if (b == -1) {
            System.out.println("Không có mã sinh viên này");
        } else {
            students.remove(b);
        }
    }

    public void selectionSortById() {
        for (int i = 0; i < students.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < students.size(); j++)
                if (students.get(j).getId() < students.get(min).getId())
                    min = j;
            Student temp = students.get(min);
            students.set(min, students.get(i));
            students.set(i, temp);
        }
        System.out.println("Danh sách đã được cập nhật");
    }

    public int checkId() {
        selectionSortById();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id cần tìm");
        int key = sc.nextInt();
        int index = -1;
        int left = 0;
        int right = students.size() - 1;
        do {
            int mid = (left + right) / 2;
            if (key == students.get(mid).getId()) {
                index = mid;
                return index;
            } else if (key < students.get(mid).getId()) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        } while (left <= right);
        return -1;
    }

    public void updateStudentInfo() {
        int a = checkId();
        if (a == -1) {
            System.out.println("Không có mã sinh viên này");
        } else {
            students.set(a, new Student().inputStudent());
        }
    }
}
