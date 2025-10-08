
class Person {
    public void displayFullName(String first, String last) {
        System.out.println("Full Name: " + first + " " + last);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.displayFullName("Tanya", "Sharma");
    }
}
