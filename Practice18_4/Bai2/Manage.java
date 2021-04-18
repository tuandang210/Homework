package Bai2;

import java.util.ArrayList;
import java.util.List;

public class Manage {
    List<Family> families = new ArrayList<>();
    public Manage() {
    }

    public Manage(List<Family> families) {
        this.families = families;
    }

    public List<Family> getTowns() {
        return families;
    }

    public void setTowns(List<Family> families) {
        this.families = families;
    }

    public void inputTown() {
            families.add(new Family().inputFamily());
    }

    public void displayTown() {
        System.out.println(families.toString());
    }

    public void findAgeMoreThan80() {
        for (int i = 0; i < families.size(); i++) {
            for (int j=0; j<families.get(i).getPerson().size();j++){
                if (families.get(i).getPerson().get(j).getOld() >= 80) {
                    System.out.println(families.get(i).toString());
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Manage{" +
                "families=" + families +
                '}';
    }
}
