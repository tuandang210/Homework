package Bai3;

import java.util.Scanner;

public class KySu extends CanBo{
    private String trainingIndustry;

    public KySu(){
    }

    public KySu(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }

    public KySu(String name, String dateOfBirth, String gender, String address, String trainingIndustry) {
        super(name, dateOfBirth, gender, address);
        this.trainingIndustry = trainingIndustry;
    }

    public String getTrainingIndustry() {
        return trainingIndustry;
    }

    public void setTrainingIndustry(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }

    public KySu inputKySuInfor(){
        Scanner sc = new Scanner(System.in);
        super.inputCanBoInfor();
        System.out.println("Nhập ngành đào tạo: ");
        this.trainingIndustry = sc.next();
        return this;
    }
}
