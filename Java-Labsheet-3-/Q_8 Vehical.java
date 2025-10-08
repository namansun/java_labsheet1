
class Vehicle {
    int speed;

    public void setSpeed(int s) {
        speed = s;
    }

    public void setSpeed(int s, int bonus) {
        speed = s + bonus;
    }

    public void display() {
        System.out.println("Speed: " + speed);
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.setSpeed(100);
        v.display();

        v.setSpeed(80, 20);
        v.display();
    }
}
