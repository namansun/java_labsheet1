
class Rectangle {
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 3);
        System.out.println("Area: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter());
    }
}
