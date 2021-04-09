package accessModifier.baiTapStudents;

public class Student {
    private String id;
    private String name;
    private String dateOfBirth;
    private double mark;

    public Student() {
    }

    public Student(String id, String name, String dateOfBirth, double mark) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.mark = mark;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", mark=" + mark +
                '}';
    }
}