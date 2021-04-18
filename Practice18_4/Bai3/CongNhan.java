package Bai3;

import java.util.Scanner;

public class CongNhan extends CanBo{
    private String level;

    public CongNhan(){
    }

    public CongNhan(String level) {
        this.level = level;
    }

    public CongNhan(String name, String dateOfBirth, String gender, String address, String level) {
        super(name, dateOfBirth, gender, address);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public CongNhan inputCongNhanInfor(){
        Scanner sc = new Scanner(System.in);
        super.inputCanBoInfor();
        System.out.println("Nhập cấp bậc của công nhân: ");
        this.level = sc.next();
        return this;
    }
}
