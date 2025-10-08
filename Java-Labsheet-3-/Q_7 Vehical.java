
class Vehicle {
    int speed;
    String color;

    public Vehicle(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    public void display() {
        System.out.println("Speed: " + speed + ", Color: " + color);
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle(120, "Red");
        v.display();
    }
}
