

class Animal {
    public void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

public class SuperclassRefDemo {
    public static void main(String[] args) {
        Animal a = new Cat(); 
        a.sound(); 
    }
}
