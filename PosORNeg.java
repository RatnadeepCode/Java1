import java.util.*;
public class PosORNeg {
    int num;
    PosORNeg(int n){
        num = n;
    }
    void checkNumber(){
        if(num>=0)
            System.out.println(num + " is positive");
        else 
            System.out.println(num + " is negative");
    }
    public static void main(String args[]){
        int x;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        x = in.nextInt();
        PosORNeg obj = new PosORNeg(x);
        obj.checkNumber();
        in.close();
    }
}
