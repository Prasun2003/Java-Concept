import java.util.Scanner;
public class assci {
    public static void main(String[] args){
        char ch;
        System.out.println("Enter a character: ");
        Scanner sc= new Scanner(System.in);
        ch= sc.next().charAt(0);
         int a=ch;
        System.out.println("Ascii value is: "+a);
    }
}
