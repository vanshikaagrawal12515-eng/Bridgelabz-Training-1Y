import java.util.*;

// Abstract class
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Concrete methods
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Abstract method
    public abstract double calculateInterest();

    // Getters (Encapsulation)
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }
}

// Interface
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

// SavingsAccount class
class SavingsAccount extends BankAccount implements Loanable {

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double calculateInterest() {
        return getBalance() * 0.04; // 4% interest
    }

    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan approved for Savings Account: " + amount);
        } else {
            System.out.println("Loan not approved for Savings Account");
        }
    }

    public boolean calculateLoanEligibility() {
        return getBalance() > 5000;
    }
}

// CurrentAccount class
class CurrentAccount extends BankAccount implements Loanable {

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double calculateInterest() {
        return getBalance() * 0.02; // 2% interest
    }

    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan approved for Current Account: " + amount);
        } else {
            System.out.println("Loan not approved for Current Account");
        }
    }

    public boolean calculateLoanEligibility() {
        return getBalance() > 10000;
    }
}

// Main class
public class BankingSystem {

    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("S101", "Rahul", 8000));
        accounts.add(new CurrentAccount("C201", "Amit", 15000));

        for (BankAccount acc : accounts) {

            System.out.println("Account Number: " + acc.getAccountNumber());
            System.out.println("Account Holder: " + acc.getHolderName());
            System.out.println("Balance: " + acc.getBalance());

            double interest = acc.calculateInterest();
            System.out.println("Calculated Interest: " + interest);

            if (acc instanceof Loanable) {
                Loanable loan = (Loanable) acc;
                loan.applyForLoan(20000);
            }

            System.out.println("--------------------------");
        }
    }
}