import java.util.Scanner;

interface Bank {
    void deposit(double amt);
    void withdraw(double amt);
}

class Customer {
    String name;
}

class Account extends Customer implements Bank {
    double balance;

    void getData(Scanner sc) {
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        if(amt <= balance)
            balance -= amt;
        else
            System.out.println("Insufficient Balance");
    }

    void display() {
        System.out.println(name + " Balance: " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account a = new Account();

        a.getData(sc);

        System.out.print("Enter deposit: ");
        a.deposit(sc.nextDouble());

        System.out.print("Enter withdraw: ");
        a.withdraw(sc.nextDouble());

        a.display();
    }
}