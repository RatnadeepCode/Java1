import java.util.Scanner;

class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Funds");
        }
    }

    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void addInterest() {
        balance += balance * interestRate / 100;
        System.out.println("Interest Added");
    }
}

class FixedDepositAccount extends SavingsAccount {
    int maturityPeriod;

    FixedDepositAccount(String accountNumber, double balance, double interestRate, int maturityPeriod) {
        super(accountNumber, balance, interestRate);
        this.maturityPeriod = maturityPeriod;
    }

    void calculateMaturityAmount() {
        double maturityAmount = balance * Math.pow((1 + interestRate/100), maturityPeriod/12.0);
        System.out.println("Maturity Amount: " + maturityAmount);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter Interest Rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Maturity Period (months): ");
        int period = sc.nextInt();

        FixedDepositAccount fd = new FixedDepositAccount(accNo, balance, rate, period);

        System.out.print("Enter amount to deposit: ");
        double dep = sc.nextDouble();
        fd.deposit(dep);

        fd.addInterest();
        fd.displayBalance();
        fd.calculateMaturityAmount();
    }
}