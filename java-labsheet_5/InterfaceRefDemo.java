

interface Movable {
    void moveUp();
    void moveDown();
}

class Robot implements Movable {
    public void moveUp() { System.out.println("Robot moves up"); }
    public void moveDown() { System.out.println("Robot moves down"); }
}

public class InterfaceRefDemo {
    public static void main(String[] args) {
        Movable m = new Robot(); 
        m.moveUp();
        m.moveDown();
    }
}
