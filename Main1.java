public class Main1 {
    static class Car {
        String brand;
        String color;
        int speed;

        void startEngine() {
            System.out.println(color + " " + brand + " engine started.");
        }

        void drive() {
            System.out.println(color + " " + brand + " is driving at " + speed + " km/h.");
        }
    }

    public static void main(String[] args) {
        // Create an object of Car
        Car car1 = new Car();

        // Set attributes
        car1.brand = "Toyota";
        car1.color = "Red";
        car1.speed = 100;

        // Call methods
        car1.startEngine();
        car1.drive();

        // Create another object
        Car car2 = new Car();
        car2.brand = "Honda";
        car2.color = "Blue";
        car2.speed = 120;

        car2.startEngine();
        car2.drive();
    }
}
