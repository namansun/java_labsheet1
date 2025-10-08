

interface A {
    default void show() { System.out.println("A's show"); }
}

interface B {
    default void show() { System.out.println("B's show"); }
}

class MyClass implements A, B {
    @Override
    public void show() {
        A.super.show(); 
    }
}

public class InterfaceConflictDemo {
    public static void main(String[] args) {
        new MyClass().show();
    }
}
