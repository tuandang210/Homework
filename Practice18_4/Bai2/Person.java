package Bai2;

import java.util.Scanner;

public class Person {
    private String name;
    private int old;
    private String job;

    public Person() {
    }

    public Person(String name, int old, String job) {
        this.name = name;
        this.old = old;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Person inputPerson(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin người dân");
        System.out.println("Nhập tên: ");
        this.name = sc.next();
        System.out.println("Nhập tuổi: ");
        this.old = sc.nextInt();
        System.out.println("Nhập nghề nghiệp: ");
        this.job = sc.next();
        return this;
    }

    public void displayPerson(Person person){
        System.out.println(person.toString());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", old=" + old +
                ", job='" + job + '\'' +
                '}';
    }
}
