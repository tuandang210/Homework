package Bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manageeeee {
    List<CanBo> canBos = new ArrayList<>();

    public Manageeeee() {
    }

    public Manageeeee(List<CanBo> canBos) {
        this.canBos = canBos;
    }

    public List<CanBo> getCanBos() {
        return canBos;
    }

    public void setCanBos(List<CanBo> canBos) {
        this.canBos = canBos;
    }

    public void inputKySu() {
        canBos.add(new KySu().inputKySuInfor());
    }

    public void inputNhanVien() {
        canBos.add(new NhanVien().inputNhanVienInfor());
    }

    public void inputCongNhan() {
        canBos.add(new CongNhan().inputCongNhanInfor());
    }

    public void displayCanBo() {
        for (int i = 0; i < canBos.size(); i++) {
            showCanBoInforByType(i);
        }
    }

    public int findCanBoByName(String name) {
        int index = -1;
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        for (int i = 0; i < canBos.size(); i++) {
            if (name.equals(canBos.get(i).getName())) {
                index = i;
            }
        }
        return index;
    }

    public void showCanBoByName(String name) {
        int index = findCanBoByName(name);
        if (index != -1) {
            showCanBoInforByType(index);
        } else {
            System.out.println("Không tìm được cán bộ có tên đó");
        }
    }

    public void showCanBoInforByType(int i) {
        if (canBos.get(i) instanceof KySu) {
            System.out.println(canBos.get(i) + " trainingIndustry: " + ((KySu) canBos.get(i)).getTrainingIndustry());
        } else if (canBos.get(i) instanceof CongNhan) {
            System.out.println(canBos.get(i) + " level: " + ((CongNhan) canBos.get(i)).getLevel());
        } else if (canBos.get(i) instanceof NhanVien) {
            System.out.println(canBos.get(i) + " job: " + ((NhanVien) canBos.get(i)).getJob());
        }
    }
}

