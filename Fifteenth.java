import java.util.*;

class Passport {
    String passportNo;
    String issueDate;
    String expiryDate;

    Passport(String passportNo, String issueDate, String expiryDate) {
        this.passportNo = passportNo;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Passport: " + passportNo +
                " Issue: " + issueDate +
                " Expiry: " + expiryDate;
    }
}

class Citizen {
    String name;
    String dob;
    String address;
    Passport passport;

    Citizen(String name, String dob, String address, Passport passport) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Citizen: " + name +
                "\nDOB: " + dob +
                "\nAddress: " + address +
                "\n" + passport;
    }
}

public class Fifteenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] citizenData = sc.nextLine().split(",");
        String[] passportData = sc.nextLine().split(",");

        Passport passport = new Passport(
                passportData[0],
                passportData[1],
                passportData[2]
        );

        Citizen citizen = new Citizen(
                citizenData[0],
                citizenData[1],
                citizenData[2],
                passport
        );

        System.out.println(citizen);
    }
}