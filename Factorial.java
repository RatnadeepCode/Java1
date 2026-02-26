import java.util.*;
class Factorial{
    int n;
    int fact(){
        int i, f=1;
        for(i=1; i<=n; i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String args[]){
        int f;
        Scanner in = new Scanner(System.in);
        Factorial obj = new Factorial();
        System.out.println("Enter a number:");
        obj.n = in.nextInt();
        f = obj.fact();
        System.out.println("Factorial of " + obj.n + " is " + f );
        in.close();
    }
}