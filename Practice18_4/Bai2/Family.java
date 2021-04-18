package Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Family {
    private int numberOfPeople;
    private int numberOfHouse;
    private List<Person> person = new ArrayList<>();

    public Family() {
    }

    public Family(int numberOfPeople, int numberOfHouse, List<Person> person) {
        this.numberOfPeople = numberOfPeople;
        this.numberOfHouse = numberOfHouse;
        this.person = person;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public int getNumberOfHouse() {
        return numberOfHouse;
    }

    public void setNumberOfHouse(int numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

    public List<Person> getPerson() {
        return person;
    }

    public void setPerson(List<Person> person) {
        this.person = person;
    }

    public Family inputFamily(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số người trong gia đình: ");
        this.numberOfPeople = sc.nextInt();
        System.out.println("Nhập số nhà mà họ sở hữu: ");
        this.numberOfHouse = sc.nextInt();
        for (int i=0; i<numberOfPeople;i++){
            person.add(new Person().inputPerson());
        }
        return this;
    }

    public void displayFamily(List<Family> family){
        System.out.println(family.toString());
    }

    @Override
    public String toString() {
        return "Family{" +
                "numberOfPeople=" + numberOfPeople +
                ", numberOfHouse=" + numberOfHouse +
                ", person=" + person +
                '}'+"\n";
    }
}
