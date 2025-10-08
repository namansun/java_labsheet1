

class Parent {
    public void display() {
        System.out.println("Parent display method");
    }
}

class Child extends Parent {
    @Override
    public void display() {
        super.display(); 
        System.out.println("Child display method");
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
