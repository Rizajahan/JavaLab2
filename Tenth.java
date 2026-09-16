import java.util.*;

interface Device {
    void turnOn();
    void turnOff();
}

class Fan implements Device {
    public void turnOn() {
        System.out.println("Fan is now ON");
    }

    public void turnOff() {
        System.out.println("Fan is now OFF");
    }
}

class Light implements Device {
    public void turnOn() {
        System.out.println("Light is now ON");
    }

    public void turnOff() {
        System.out.println("Light is now OFF");
    }
}

public class Tenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String type = sc.nextLine();

            if (type.isEmpty())
                break;

            Device device;

            if (type.equalsIgnoreCase("Fan"))
                device = new Fan();
            else
                device = new Light();

            device.turnOn();
            device.turnOff();
        }
    }
}