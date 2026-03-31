class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void showAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        showAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        showAccountInfo();
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int tenureMonths;

    FixedDepositAccount(int accountNumber, double balance, int tenureMonths) {
        super(accountNumber, balance);
        this.tenureMonths = tenureMonths;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        showAccountInfo();
        System.out.println("Tenure: " + tenureMonths + " months");
    }
}

public class Bank {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1001, 50000, 5);
        CheckingAccount ca = new CheckingAccount(1002, 20000, 10000);
        FixedDepositAccount fda = new FixedDepositAccount(1003, 100000, 12);

        sa.displayAccountType();
        System.out.println();
        ca.displayAccountType();
        System.out.println();
        fda.displayAccountType();
    }
}