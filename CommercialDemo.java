import java.util.Scanner;   
interface SalesDepartment {
    void processSale(double amount);
}

interface FinanceDepartment {
    void generateInvoice(String clientName, double amount);
}

class CommercialExecutive implements SalesDepartment, FinanceDepartment {

    public void processSale(double amount) {
        System.out.println("Sale processed: " + amount);
    }

    public void generateInvoice(String clientName, double amount) {
        System.out.println("Invoice for " + clientName + ": " + amount);
    }

    void showSummary() {
        System.out.println("Commercial operations completed successfully.");
    }
}

public class CommercialDemo {
    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);

        CommercialExecutive ce = new CommercialExecutive();

        System.out.print("Enter client name: ");
        String name = sc.nextLine();

        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();

        ce.processSale(amt);
        ce.generateInvoice(name, amt);
        ce.showSummary();
    }
}