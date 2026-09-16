import java.util.*;

class Vehicle {
    String regNo;
    String brand;
    double baseRate;

    Vehicle(String regNo, String brand, double baseRate) {
        this.regNo = regNo;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    double calculateRent() {
        return baseRate;
    }
}

class Car extends Vehicle {
    Car(String regNo, String brand, double baseRate) {
        super(regNo, brand, baseRate);
    }

    @Override
    double calculateRent() {
        return baseRate * 1.5;
    }

    @Override
    public String toString() {
        return "Car " + regNo + " " + brand +
                " Rent: " + calculateRent();
    }
}

class Bike extends Vehicle {
    Bike(String regNo, String brand, double baseRate) {
        super(regNo, brand, baseRate);
    }

    @Override
    double calculateRent() {
        return baseRate * 1.2;
    }

    @Override
    public String toString() {
        return "Bike " + regNo + " " + brand +
                " Rent: " + calculateRent();
    }
}

public class Twelfth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String input = sc.nextLine();

            if (input.isEmpty())
                break;

            String[] data = input.split(",");

            String type = data[0];
            String regNo = data[1];
            String brand = data[2];
            double baseRate = Double.parseDouble(data[3]);

            Vehicle vehicle;

            if (type.equalsIgnoreCase("Car"))
                vehicle = new Car(regNo, brand, baseRate);
            else
                vehicle = new Bike(regNo, brand, baseRate);

            System.out.println(vehicle);
        }
    }
}