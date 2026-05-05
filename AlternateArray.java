import java.util.Scanner;
public class AlternateArray {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n, i;
        System.out.println("Enter number of elements:");
        n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for(i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Alternate Elements are:");
        for(i=0; i<n; i=i+2){
            System.out.println(arr[i] + " ");
        }
        in.close();
    }
}
