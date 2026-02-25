import java.util.*;
public class Reversing {
    void rev(int n){
        int d = 0, r = 0, m;
        m = n;
        System.out.println("Before Reversing = " +m);
        while(n>0){
            d = n % 10;
            r = r*10 + d;
            n = n/10;
        }
        System.out.println("After Reversing = " +r);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter a number :");
        n = in.nextInt();
        Reversing obj = new Reversing();
        obj.rev(n);
        in.close();
    }
}
