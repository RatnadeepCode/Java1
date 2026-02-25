import java.util.*;
public class Percentage {
    void grading(int p){
        char grade;
        if(p>=90)
            grade = 'A';
        else if(p>=80 && p<90)
            grade = 'B';
        else if(p>=70 && p<80)
            grade = 'c';
        else if(p>=60 && p<70)
            grade = 'D';
        else if(p>=40 && p<60)
            grade = 'E';
        else
            grade = 'F';
        System.out.println("Grade = " +grade);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int p;
        System.out.println("Enter the percentage :");
        p = in.nextInt();;
        Percentage obj = new Percentage();
        obj.grading(p); 
        in.close();
    }
}