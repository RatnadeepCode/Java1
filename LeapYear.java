import java.util.*;
public class LeapYear {
    void check(int y){
        if((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
            System.out.println(y + " is a leap year!!");
        else 
            System.out.println(y + " is not a leap year!!");
    }   
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        LeapYear obj = new LeapYear();
        int n;
        System.out.println("Enter a year to check leap year or not :");
        n = in.nextInt();
        obj.check(n);
        in.close();
    }
}
