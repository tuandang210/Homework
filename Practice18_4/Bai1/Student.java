package Bai1;

import java.util.Scanner;

public class Student {
    private String name;
    private int studentId;
    private String dateOfBirth;
    private String studentClass;

    public Student() {
    }

    public Student(String name, int studentId, String dateOfBirth, String studentClass) {
        this.name = name;
        this.studentId = studentId;
        this.dateOfBirth = dateOfBirth;
        this.studentClass = studentClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public Student inputStudent() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập thông tin sinh viên");
        System.out.println("Họ và tên: ");
        this.name = sc.next();
        System.out.println("Nhập mã sinh viên: ");
        this.studentId = sc.nextInt();
        System.out.println("Nhập ngày sinh: ");
        this.dateOfBirth = sc.next();
        System.out.println("Nhập lớp của sinh viên: ");
        this.studentClass = sc.next();
        return this;
    }

    public void displayStudent(Student student){
        System.out.println(student.toString());
    }

    @Override
    public String toString() {
        return "Bai1.Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", studentClass='" + studentClass + '\'' +
                '}';
    }
}
