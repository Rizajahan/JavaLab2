import java.util.*;

abstract class Loan {
    double principal;
    double time;

    Loan(double principal, double time) {
        this.principal = principal;
        this.time = time;
    }

    abstract double calculateInterest();
}

class HomeLoan extends Loan {

    HomeLoan(double principal, double time) {
        super(principal, time);
    }

    @Override
    double calculateInterest() {
        return (principal * 8 * time) / 100;
    }

    @Override
    public String toString() {
        return "Home Loan Interest: " + calculateInterest();
    }
}

class CarLoan extends Loan {

    CarLoan(double principal, double time) {
        super(principal, time);
    }

    @Override
    double calculateInterest() {
        return (principal * 10 * time) / 100;
    }

    @Override
    public String toString() {
        return "Car Loan Interest: " + calculateInterest();
    }
}

public class Eighth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String input = sc.nextLine();

            if (input.isEmpty())
                break;

            String[] data = input.split(",");

            String type = data[0];
            double principal = Double.parseDouble(data[1]);
            double time = Double.parseDouble(data[2]);

            Loan loan;

            if (type.equalsIgnoreCase("Home"))
                loan = new HomeLoan(principal, time);
            else
                loan = new CarLoan(principal, time);

            System.out.println(loan);
        }
    }
}