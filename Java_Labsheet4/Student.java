class Student {
    static String college = "ABC College"; // static (shared)
    String name; // instance (unique per object)

    Student(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name + " studies at " + college);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Tanya");
        Student s2 = new Student("Utkarsh");

        s1.show();
        s2.show();

      
        Student.college = "XYZ University";
        s1.show();
        s2.show();
    }
}
