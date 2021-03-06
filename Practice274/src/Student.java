import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable {
    private int id;
    private String name;
    private String homeTown;
    private String inClass;
    private int score;

    public Student() {
    }

    public Student(int id, String name, String homeTown, String inClass, int score) {
        this.id = id;
        this.name = name;
        this.homeTown = homeTown;
        this.inClass = inClass;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getInClass() {
        return inClass;
    }

    public void setInClass(String inClass) {
        this.inClass = inClass;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", homeTown='" + homeTown + '\'' +
                ", inClass='" + inClass + '\'' +
                ", score=" + score +
                '}'+"\n";
    }
}
