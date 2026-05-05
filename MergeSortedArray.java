import java.util.Scanner;
public class MergeSortedArray {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n1, n2, i, j, k;
        System.out.println("Enter size of array A:");
        n1 = in.nextInt();
        int A[] = new int[n1];
        System.out.println("Enter the elements of array A:");
        for(i=0; i<n1; i++){
            A[i] = in.nextInt();
        }
        System.out.println("Enter size of array B:");
        n2 = in.nextInt();
        int B[] = new int[n2];
        System.out.println("Enter the elements of array B:");
        for(i=0; i<n2; i++){
            B[i] = in.nextInt();
        }
        int C[] = new int[n1+n2];
        i = j = k = 0;
        while(i<n1 && j<n2){
            if(A[i]<B[j])
                C[k++]=A[i++];
            else
                C[k++] = B[j++];
        }
        while(i<n1)
            C[k++] = A[i++];
        while(j<n2)
            C[k++] = B[j++];
        System.out.println("Merged Sorted Array:");
        for(i=0; i<C.length; i++)
            System.out.println(C[i] + " ");
        in.close();
    }
}
