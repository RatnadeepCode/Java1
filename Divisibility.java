import java.util.*;
class Divisibility{
    int num;
    void display(){
        int d;
        d = num % 10;
        if(d==0 || d==5)
            System.out.println(num + " is divisible by 5");
        else
            System.out.println(num + " is not divisible by 5");
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Divisibility obj = new Divisibility();
        System.out.println("Enter a number:");
        obj.num = in.nextInt();
        obj.display();
        in.close();
    }
}