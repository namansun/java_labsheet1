
class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public static void updateSalary(Employee e, double newSalary) {
        e.salary = newSalary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Rahul", 40000);
        updateSalary(emp, 50000);
        System.out.println(emp.name + " new salary: " + emp.salary);
    }
}
