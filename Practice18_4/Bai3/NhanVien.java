package Bai3;

import java.util.Scanner;

public class NhanVien extends CanBo{
    private String job;

    public NhanVien(){
    }

    public NhanVien(String job) {
        this.job = job;
    }

    public NhanVien(String name, String dateOfBirth, String gender, String address, String job) {
        super(name, dateOfBirth, gender, address);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public NhanVien inputNhanVienInfor(){
        Scanner sc = new Scanner(System.in);
        super.inputCanBoInfor();
        System.out.println("Nhập công việc: ");
        this.job = sc.next();
        return this;
    }
}
