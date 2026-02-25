import java.util.*;
public class Maximum {
    int max;
    void check(int a, int b, int c){
        max = (a>b)?(a>c)?a:c:(b>c)?b:c;
        System.out.println("Maximum number = " +max);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Maximum obj = new Maximum();
        int a, b, c;
        System.out.println("Enter three numbers :");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        obj.check(a, b, c);
        in.close();
    }
}
