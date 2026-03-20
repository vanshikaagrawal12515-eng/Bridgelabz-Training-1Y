class Account {
    int accountNumber;
    double balance;
    static String bankName = "National Bank";

    Account(int accNo, double bal) {
        accountNumber = accNo;
        balance = bal;
    }

    double calculateInterest() {
        return 0;
    }
}

class SavingsAccount extends Account {

    SavingsAccount(int accNo, double bal) {
        super(accNo, bal);
    }

    double calculateInterest() {
        return balance * 0.04;
    }
}

class CurrentAccount extends Account {

    CurrentAccount(int accNo, double bal) {
        super(accNo, bal);
    }

    double calculateInterest() {
        return balance * 0.02;
    }
}

class BankTest {
    public static void main(String[] args) {
        Account a1 = new SavingsAccount(1, 10000);
        Account a2 = new CurrentAccount(2, 10000);

        System.out.println("Savings Interest: " + a1.calculateInterest());
        System.out.println("Current Interest: " + a2.calculateInterest());
    }
}
