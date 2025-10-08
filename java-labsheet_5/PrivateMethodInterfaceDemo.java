

interface MyInterface {
    private void helper() {
        System.out.println("Private helper method");
    }

    default void show() {
        helper(); 
        System.out.println("Default method");
    }
}

class MyClass implements MyInterface {}

public class PrivateMethodInterfaceDemo {
    public static void main(String[] args) {
        new MyClass().show();
    }
}
