package Bai3;

import java.util.Scanner;

public class CanBo {
    private String name;
    private String dateOfBirth;
    private String gender;
    private String address;

    public CanBo() {
    }

    public CanBo(String name, String dateOfBirth, String gender, String address) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CanBo inputCanBoInfor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin cán bộ nhân viên");
        System.out.println("Nhập tên: ");
        this.name = sc.next();
        System.out.println("Nhập ngày sinh: ");
        this.dateOfBirth = sc.next();
        System.out.println("Nhập giới tính: ");
        this.gender = sc.next();
        System.out.println("Nhập địa chỉ: ");
        this.address = sc.next();
        return this;
    }

    @Override
    public String toString() {
        return "CanBo" +
                " name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\''+",";
    }
}
