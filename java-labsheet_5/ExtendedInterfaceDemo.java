

interface A {
    void methodA();
}

interface B extends A {
    void methodB();
}

class MyClass implements B {
    public void methodA() { System.out.println("Method A"); }
    public void methodB() { System.out.println("Method B"); }
}

public class ExtendedInterfaceDemo {
    public static void main(String[] args) {
        B obj = new MyClass();
        obj.methodA();
        obj.methodB();
    }
}
