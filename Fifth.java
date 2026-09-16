import java.util.*;

class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }
}

class Doctor extends Person {
    protected String specialization;

    Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSpecialization: " + specialization;
    }
}

class Surgeon extends Doctor {
    private String surgeryType;

    Surgeon(String name, int age, String specialization, String surgeryType) {
        super(name, age, specialization);
        this.surgeryType = surgeryType;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSurgery Type: " + surgeryType;
    }
}

public class Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] data = sc.nextLine().split(",");

        Surgeon s = new Surgeon(
                data[0],
                Integer.parseInt(data[1]),
                data[2],
                data[3]);

        System.out.println(s);
    }
}