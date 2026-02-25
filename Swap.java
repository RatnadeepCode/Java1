import java.util.*;
public class Swap {
    int a, b;
    void swapping(){
        System.out.println("Before Swapping a = " +a+ " and b = " +b);
        int c = a;
        a = b;
        b = c;
        System.out.println("After Swapping a = " +a+ " and b = " +b);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Swap obj = new Swap();
        System.out.println("Enter two numbers:");
        obj.a = in.nextInt();
        obj.b = in.nextInt();
        obj.swapping();
        in.close();
    }
}
