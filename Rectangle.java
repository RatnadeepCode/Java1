import java.util.*;
public class Rectangle {
    double l, w;
    void calculate(){
        double area = l*w;
        double perimeter = 2*(l+w);
        System.out.println("Area of Rectangle = " +area);
        System.out.println("Perimeter of Rectangle = " +perimeter);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Rectangle obj = new Rectangle();
        System.out.println("Enter the length and breadth of Rectangle:");
        obj.l = in.nextDouble();
        obj.w = in.nextDouble();
        obj.calculate();
        in.close();
    }
}
