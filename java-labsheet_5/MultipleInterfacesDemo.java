
interface A {
    void methodA();
}

interface B {
    void methodB();
}

class MyClass implements A, B {
    public void methodA() { System.out.println("Method A implemented"); }
    public void methodB() { System.out.println("Method B implemented"); }
}

public class MultipleInterfacesDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA();
        obj.methodB();
    }
}
