

class Vehicle {
    public void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    public void honk() {
        System.out.println("Car honks");
    }
}

class ElectricCar extends Car {
    public void chargeBattery() {
        System.out.println("Electric car charging");
    }
}
 class VehicleDemo {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();
        ec.start();
        ec.honk();
        ec.chargeBattery();
    }
}
