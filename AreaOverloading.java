import java.util.Scanner;

class Area {
    double calculate(double r) {
        return 3.14 * r * r;
    }

    double calculate(double l, double b) {
        return l * b;
    }

    double calculate(int side) {
        return side * side;
    }
}

public class AreaOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area a = new Area();

        System.out.println("Enter 1 for area of circle");
        System.out.println("Enter 2 for area of rectangle");
        System.out.println("Enter 3 for area of square");
        System.out.println("Enter your choice:");
        int ch = sc.nextInt();

        switch(ch) {
            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                System.out.println("Area: " + a.calculate(r));
                break;
            case 2:
                System.out.print("Enter length & breadth: ");
                double l = sc.nextDouble();
                double b = sc.nextDouble();
                System.out.println("Area: " + a.calculate(l, b));
                break;
            case 3:
                System.out.print("Enter side: ");
                int s = sc.nextInt();
                System.out.println("Area: " + a.calculate(s));
                break;
        }
    }
}