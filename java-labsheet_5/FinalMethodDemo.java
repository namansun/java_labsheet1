

class Parent {
    public final void show() {
        System.out.println("Final method in Parent");
    }
}

class Child extends Parent {

}

public class FinalMethodDemo {
    public static void main(String[] args) {
        new Child().show();
    }
}
