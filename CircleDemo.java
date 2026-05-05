import java.util.Scanner;

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Circle {
    Point p;
    double radius;

    Circle(Point p, double radius) {
        this.p = p;
        this.radius = radius;
    }

    void display() {
        System.out.println("Center: (" + p.x + ", " + p.y + ")");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + (3.14 * radius * radius));
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x and y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        Point p = new Point(x, y);
        Circle c = new Circle(p, r);

        c.display();
    }
}