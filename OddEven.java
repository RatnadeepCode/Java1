import java.util.*;
public class OddEven {
    int num;
    void check(){
        if(num % 2 == 0 )
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    } 
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        OddEven obj = new OddEven();
        System.out.println("Enter a number:");
        obj.num =  in.nextInt();
        obj.check();
        in.close();
    }
}
