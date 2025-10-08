


class Person {
    String name;

    public Person(String name) {
        this.name = name;
        System.out.println("Person constructor called for " + name);
    }
}

class Student extends Person {
    int rollNo;

    public Student(String name, int rollNo) {
        super(name); 
        this.rollNo = rollNo;
        System.out.println("Student constructor called for roll no: " + rollNo);
    }
}

public class PersonStudentDemo {
    public static void main(String[] args) {
        Student s = new Student("Tanya", 101);
    }
}
