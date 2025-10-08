

class Shape {
    public void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
