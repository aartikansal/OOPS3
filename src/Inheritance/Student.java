package Inheritance;
//Student is a sub class
public class Student extends Person{
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

    private String collegeName;
    private int year;
}
