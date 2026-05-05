import java.util.Scanner;

class Box {
    int length, breadth;

    Box() {
        length = 0;
        breadth = 0;
    }

    Box(int l, int b) {
        length = l;
        breadth = b;
    }

    void display() {
        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Box b1 = new Box();

        System.out.print("Enter length: ");
        int l = sc.nextInt();

        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        Box b2 = new Box(l, b);

        System.out.println("Default Constructor:");
        b1.display();

        System.out.println("Parameterized Constructor:");
        b2.display();
    }
}