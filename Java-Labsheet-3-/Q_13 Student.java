
class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public static Student updateMarks(Student s, int newMarks) {
        return new Student(s.name, newMarks);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Tanya", 85);
        Student s2 = updateMarks(s1, 95);

        System.out.println("Original: " + s1.name + " " + s1.marks);
        System.out.println("Updated: " + s2.name + " " + s2.marks);
    }
}
