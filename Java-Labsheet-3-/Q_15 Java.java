
class Car {
    String color;
    int speed;

    public Car setColor(String color) {
        this.color = color;
        return this; 
    }

    public Car setSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    public void display() {
        System.out.println("Car color: " + color + ", Speed: " + speed);
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.setColor("Red").setSpeed(120).display(); 
    }
}
