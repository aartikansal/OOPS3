package Inheritance;

import java.math.BigDecimal;

public class Employee extends Person {
    private String title;
    private String employer;
    private char employeeGrade;
    private BigDecimal salary;

    public String getTitle() {
        return title;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public char getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(char employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return super.toString() + "#" + title + "#" + employer + "#" + employeeGrade ;
    }
}