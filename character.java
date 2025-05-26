import java.util.Scanner;
public class character {
    public static void main(String args[]){
        char ch;
        System.out.println("enter character: ");
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(5); //for char it is string so java has these method to use string
        System.out.println(ch);
    }
}
