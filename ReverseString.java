import java.util.Scanner;
class ReverseWords{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Sentence:");
        String str = in.nextLine();
        String word = "";
        int i;
        for(i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            if(ch!=' ')
                word = word + ch;
            else{
                System.out.println(word + " ");
                word = "";
            }
        }
        System.out.print(word);
        in.close();
    }
}