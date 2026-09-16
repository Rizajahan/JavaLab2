import java.util.*;

class Account {
    String accNo;
    String holderName;
    private double balance;

    Account(String accNo, String holderName) {
        this.accNo = accNo;
        this.holderName = holderName;
        balance = 0;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    double getBalance() {
        return balance;
    }
}

public class Fourteenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Account account = new Account("A101", "User");

        for (int i = 0; i < n; i++) {
            String[] data = sc.nextLine().split(" ");

            if (data[0].equalsIgnoreCase("deposit")) {
                account.deposit(Double.parseDouble(data[1]));
            }
            else if (data[0].equalsIgnoreCase("withdraw")) {
                account.withdraw(Double.parseDouble(data[1]));
            }
            else if (data[0].equalsIgnoreCase("getBalance")) {
                System.out.println("Balance: " + account.getBalance());
            }
        }
    }
}