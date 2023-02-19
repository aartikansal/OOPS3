package Inheritance;
//Student is a sub class
public class Student extends Person {
    private String collegeName;
    private int year;

    public Student(String name, String collegeName) {
        super(name);
        this.collegeName = collegeName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        this.year = year;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}



