
import java.util.Scanner;

class Tools {

    private double balance = 0;

    public void accountCreation() {
        System.out.println("Account successfully created!");
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited ₹" + amount);
            System.out.println("Current balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew ₹" + amount);
            System.out.println("Current balance: ₹" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
}

public class bankSystem {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Tools tools = new Tools();
            boolean exit = false;

            while (!exit) {
                System.out.println("\nEnter your choice:");
                System.out.println("1 : Deposit\n2 : Withdraw\n3 : Account Creation\n4 : Exit");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1 -> {
                        System.out.println("Enter the amount [deposit]:");
                        double depositAmount = sc.nextDouble();
                        tools.deposit(depositAmount);
                    }

                    case 2 -> {
                        System.out.println("Enter the amount [withdraw]:");
                        double withdrawAmount = sc.nextDouble();
                        tools.withdraw(withdrawAmount);
                    }

                    case 3 ->
                        tools.accountCreation();

                    case 4 -> {
                        System.out.println("Exiting!");
                        exit = true;
                    }

                    default ->
                        System.out.println("Invalid choice!");
                }
            }
        }
    }
}
