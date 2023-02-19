package Inheritance;

public class StudentRunner {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Aarti");
        student.setEmail("aka@gmail");
        //IS A RELATIONSHIP, STUDENT IS A PERSON
        /*Person person = new Person();
        person.setName("Aarti");
        person.setEmail("email");
        person.setPhoneNumber("678697");
        String value = person.toString();
        System.out.println(value);
        System.out.println(person);*/
        Employee employee = new Employee();
        employee.setName("Aarti");
        employee.setEmail("email");
        employee.setPhoneNumber("678697");
        employee.setEmployeeGrade('A');
        employee.setTitle("Program Analyst");
        System.out.println(employee);




    }
}
