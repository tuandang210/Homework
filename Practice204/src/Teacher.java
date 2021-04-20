import java.util.Scanner;

public class Teacher {
    private String name;
    private String dateOfBirth;
    private String homeTown;

    public Teacher() {
    }

    public Teacher(String name, String dateOfBirth, String homeTown) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.homeTown = homeTown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public Teacher inputTeacherInfor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        this.name = sc.next();
        System.out.println("Nhập ngày sinh: ");
        this.dateOfBirth = sc.next();
        System.out.println("Nhập quê quán: ");
        this.homeTown = sc.next();
        return this;
    }

    public void displayTeacher(Teacher teacher){
        System.out.println(teacher.toString());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", homeTown='" + homeTown + '\'' +
                '}';
    }
}
