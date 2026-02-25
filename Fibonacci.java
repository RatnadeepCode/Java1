import java.util.*;
public class Fibonacci {
    void fibo(int n){
        int first = 0, second = 1;
        int next, i;
        System.out.println("Fibonacci Series:");
        for(i=1; i<=n; i++){
            System.out.print(first + " ");;
            next = first + second;
            first = second;
            second = next;
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of terms:");
        n = in.nextInt();
        Fibonacci obj = new Fibonacci();
        obj.fibo(n);;
        in.close();
    }
}
