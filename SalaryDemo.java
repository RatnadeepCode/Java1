import java.util.Scanner;

interface Gross {
    double calculateGross();
}

class Employee {
    String name;
    double basic;

    void getData(Scanner sc) {
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Basic Salary: ");
        basic = sc.nextDouble();
    }
}

class Salary extends Employee implements Gross {
    public double calculateGross() {
        return basic + (0.2 * basic) + (0.1 * basic);
    }

    void display() {
        System.out.println("Gross Salary: " + calculateGross());
    }
}

public class SalaryDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Salary s = new Salary();

        s.getData(sc);
        s.display();
    }
}