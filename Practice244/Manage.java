import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manage {
    Scanner sc = new Scanner(System.in);
    List<Student> students = new ArrayList<>();

    public Manage() {
    }

    public Manage(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void inputBlockA() {
        this.students.add(new BlockA().inputBockAInfor());
    }

    public void inputBockB() {
        this.students.add(new BlockB().inputBockBInfor());
    }

    public void inputBockC() {
        this.students.add(new BlockC().inputBockCInfor());
    }

    public void showStudentInformation() {
        for (Student x : this.students) {
            System.out.println(x.toString());
        }
    }

    public void removeStudentById() {
        int number = checkId();
        if (number == -1) {
            System.out.println("Không tìm được thí sinh có id đó");
        } else {
            this.students.remove(number);
            System.out.println("Danh sách đã được cập nhật");
        }
    }

    public void changeStudentInforById() {
        int fix = checkId();
        if (fix == -1) {
            System.out.println("Không tìm được thí sinh có id đó");
        } else {
            if (this.students.get(fix) instanceof BlockA) {
                this.students.set(fix, new BlockA().inputBockAInfor());
            } else if (this.students.get(fix) instanceof BlockB) {
                this.students.set(fix, new BlockB().inputStudent());
            } else if (this.students.get(fix) instanceof BlockC) {
                this.students.set(fix, new BlockC().inputStudent());
            }
        }
    }

    public void showStudentById() {
        int point = checkId();
        if (point == -1) {
            System.out.println("Không tìm được thí sinh có id đó");
        } else {
            System.out.println(this.students.get(point).toString());
        }
    }

    public void selectionSortName() {
        for (int i = 0; i < this.students.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < this.students.size(); j++) {
                if (this.students.get(j).getName().compareTo(this.students.get(min).getName()) < 0) {
                    min = j;
                }
            }
            Student temp = this.students.get(i);
            this.students.set(i, this.students.get(min));
            this.students.set(min, temp);

        }
        System.out.println("Danh sách đã được cập nhật");
    }

    public void selectionSortId() {
        for (int i = 0; i < this.students.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < this.students.size(); j++) {
                if (this.students.get(j).getId() < this.students.get(min).getId())
                    min = j;
            }
            Student temp = this.students.get(min);
            this.students.set(min, this.students.get(i));
            this.students.set(i, temp);
        }
        System.out.println("Danh sách đã được cập nhật");
    }

    public int checkId() {
        selectionSortId();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id cần tìm");
        int key = sc.nextInt();
        int index = -1;
        int left = 0;
        int right = this.students.size() - 1;
        do {
            int mid = (left + right) / 2;
            if (key == this.students.get(mid).getId()) {
                index = mid;
                return index;
            } else if (key < this.students.get(mid).getId()) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        } while (left <= right);
        return -1;
    }
}
