// Main.java
public class Main {
    public static void main(String[] args) {

        Driver d1 = new Driver("Alex", "KZ-12345");
        Driver d2 = new Driver("Mira", "KZ-67890");

        Vehicle[] vehicles = {
                new Car("Toyota", 2020, d1, 4, "Gasoline"),
                new Motorcycle("Honda", 2018, d2, false),
                new Truck("Volvo", 2015, d1, 12.5, 4)
        };

        for (Vehicle v : vehicles) {
            v.startEngine();
            v.displayInfo();
            v.displayDriver();
            v.stopEngine();
            System.out.println("---------------------");
        }
    }
}
