import java.util.Scanner;

public class Atmsystem {
    // Initial balance, and limits for withdrawal
    private double balance;
    private final double withdrawalLimit = 1000.0;

    public Atmsystem(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
            System.out.println("New balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else if (amount > withdrawalLimit) {
            System.out.println("Withdrawal amount exceeds limit of $" + withdrawalLimit);
        } else {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount);
            System.out.println("Remaining balance: $" + balance);
        }
    }

    // Main method for ATM operations
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Atmsystem atm = new Atmsystem(5000.0);  // Initialize the ATM with a balance of $5000
        
        int choice;

        do {
            // Display the menu
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            
            // Perform operations based on user choice
            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
